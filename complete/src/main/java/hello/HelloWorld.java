package hello;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.io.LineNumberReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.TreeSet;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
public class HelloWorld implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(HelloWorld.class);

	@Autowired // This means to get the bean called userRepository
			   // Which is auto-generated by Spring, we will use it to handle the data
	private TbAddrRepository tbAddrRepository;

	@Autowired
	private TbEmdRepository tbEmdRepository;

	@Autowired
        private TbMapRepository tbMapRepository;

	@Autowired
	private TbKbSiseRepository tbKbSiseRepository;

	@Autowired
        private TbKabSiseRepository tbKabSiseRepository;

	@Autowired
        private TbOlprRepository tbOlprRepository;

	@Autowired
        private TbEhprRepository tbEhprRepository;

	@Autowired
        private TbEmmRepository tbEmmRepository;

	private void loadAddr(String[] data) {

		log.debug("loadAddr() start...");

		TbAddr n = new TbAddr();
                n.setStnmUnonCd(data[0]);
                n.setCityCd(data[1]);
		n.setSgguCd(data[2]);
		n.setEmdCd(data[3]);
		n.setLtnoBno(data[4]);
		n.setLtnoBuno(data[5]);
		n.setBldgNm(data[6]);
		n.setDtlBldgNm(data[7]);
		n.setSgguBldgNm(data[8]);
		n.setLtnoAddr(data[9]);
		n.setStnmAddr(data[10]);
		n.setLwdgCd(data[11].substring(0, 8));
		n.setStnm(data[12]);
		n.setBldgBno(data[13]);
		n.setBldgBuno(data[14]);
                tbAddrRepository.save(n);

		log.debug("loadAddr() end...");

	}

	private void etlAddr(String fileName, int cnt) throws Exception {

		log.info("etlAddr() start...");

                LineNumberReader in = new LineNumberReader(new FileReader(fileName));

                String s = "";
                int i = 0;
                while((s = in.readLine()) != null) {
                        i++;
			if(i == 1) continue;
			if(cnt > 0 && i > cnt) break;

                        if(i % 1000 == 0) {
                                log.info("i = " + i);
                        }

                        String[] parts = s.split("\\|");
                        /*
                        for(int j = 0; j < parts.length; j++) {
                                log.info("parts[" + j + "] = " + parts[j]);
                        }*/

                        String[] data = new String[15];
                        for(int j = 0; j < data.length; j++) {
                                data[j] = parts[j];
                        }
                        loadAddr(data);
                }

                log.info("etlAddr() end...");
	}

	private void loadEmd(String[] data) {

                log.debug("loadEmd() start...");

                TbEmd n = new TbEmd();
		n.setSeq(Integer.parseInt(data[0]));
		n.setCityCd(data[1]);
		n.setSgguCd(data[2]);
		n.setEmdCd(data[3]);
		n.setEmdNm(data[4]);
                tbEmdRepository.save(n);

                log.debug("loadEmd() end...");

        }

	private void etlEmd(String fileName, int cnt) throws Exception {

                log.info("etlEmd() start...");

                LineNumberReader in = new LineNumberReader(new FileReader(fileName));

                String s = "";
                int i = 0;
                while((s = in.readLine()) != null) {
                        i++;

			if(i == 1) continue;
			if(cnt > 0 && i > cnt) break;

                        if(i % 1000 == 0) {
                                log.info("i = " + i);
                        }

                        String[] parts = s.split("\\|");
                        /*
                        for(int j = 0; j < parts.length; j++) {
                                log.info("parts[" + j + "] = " + parts[j]);
                        }*/

                        String[] data = new String[5];
                        for(int j = 0; j < data.length; j++) {
				if(j == 0) {
					data[j] = "" + i;
				} else {
                                	data[j] = parts[j - 1];
				}
                        }
                        loadEmd(data);
                }

                log.info("etlEmd() end...");
        }

	private void loadEmm() {

		log.debug("loadEmm() start...");

		Gson gson = new Gson();

		TbEmm n = new TbEmm();
		n.setSeq(0);
		n.setJson(gson.toJson(new HashMap()));
		tbEmmRepository.save(n);

		HashMap map = new HashMap();
		map.put("hsPrc", 239203990000L);
		n = new TbEmm();
		n.setSeq(1);
		n.setJson(gson.toJson(map));
		tbEmmRepository.save(n);
	
		log.debug("loadEmm() end...");

	}

	private void etlEmm() throws Exception {

		log.info("etlEmm() start...");

		loadEmm();

		log.info("etlEmm() end...");
	}

	private void loadMap(String[] data) {

                log.debug("loadMap() start...");

                TbMap n = new TbMap();
                n.setSeq(Integer.parseInt(data[0]));
                n.setStnmUnonCd(data[1]);
		n.setSiseDvcd(data[2]);
		n.setSiseMapRelSeq(data[3]);
		n.setSiseMapDstgKeyVal(data[4]);
		tbMapRepository.save(n);

                log.debug("loadMap() end...");

        }

	private void etlMap(String fileName, int cnt) throws Exception {

                log.info("etlMap() start...");

                LineNumberReader in = new LineNumberReader(new FileReader(fileName));

                String s = "";
                int i = 0;
                while((s = in.readLine()) != null) {
                        i++;
			if(i == 1) continue;
			if(cnt > 0 && i > cnt) break;

                        if(i % 1000 == 0) {
                                log.info("i = " + i);
                        }

                        String[] parts = s.split("\\|");
                        /*
                        for(int j = 0; j < parts.length; j++) {
                                log.info("parts[" + j + "] = " + parts[j]);
                        }*/

                        String[] data = new String[5];
                        for(int j = 0; j < data.length; j++) {
                                if(j == 0) {
                                        data[j] = "" + i;
                                } else {
                                        data[j] = parts[j - 1];
                                }
                        }
                        loadMap(data);
                }

                log.info("etlMap() end...");
        }

	private void loadKbSise(String[] data) {

                log.debug("loadKbSise() start...");

                TbKbSise n = new TbKbSise();
		n.setSeq(Integer.parseInt(data[0]));
		n.setKbHsDstgNo(data[1]);
		n.setKbPtySeq(data[2]);
		n.setRschDy(data[3]);
		n.setPyngArea(data[4]);
		n.setPtyTypeNm(data[5]);
		n.setExcvArea(data[6]);
		n.setHhldCnt(data[7]);
		n.setRoomCnt(data[8]);
		n.setBathCnt(data[9]);
		n.setSplyArea(data[10]);
		n.setEtcAreaCont(data[11]);
		n.setTrdTopPrc(Long.parseLong(data[12]));
		n.setTrdBttmPrc(Long.parseLong(data[13]));
		n.setTrdAvgPrc(Long.parseLong(data[14]));
		n.setJnseTopPrc(Long.parseLong(data[15]));
		n.setJnseBttmPrc(Long.parseLong(data[16]));
                tbKbSiseRepository.save(n);

                log.debug("loadKbSise() end...");

        }

	private void etlKbSise(String fileName, int cnt) throws Exception {

                log.info("etlKbSise() start...");

                LineNumberReader in = new LineNumberReader(new FileReader(fileName));

                String s = "";
                int i = 0;
                while((s = in.readLine()) != null) {

                        i++;
                        if(i == 1) continue;
			if(cnt > 0 && i > cnt) break;

                        if(i % 1000 == 0) {
                                log.info("i = " + i);
                        }

                        String[] parts = s.split("\\|");
                        /*
                        for(int j = 0; j < parts.length; j++) {
                                log.info("parts[" + j + "] = " + parts[j]);
                        }*/

                        String[] data = new String[17];
                        for(int j = 0; j < data.length; j++) {
                                if(j == 0) {
                                        data[j] = "" + i;
                                } else {
                                        data[j] = parts[j - 1];
                                }
                        }
                        loadKbSise(data);
                }

                log.info("etlKbSise() end...");
        }

	private void loadKabSise(String[] data) {

                log.debug("loadKabSise() start...");

                TbKabSise n = new TbKabSise();
                n.setSeq(Integer.parseInt(data[0]));
		n.setKabDnjiNo(data[1]);
		n.setKabPtyNo(data[2]);
		n.setPyngArea(data[3]);
		n.setPtyTypeNm(data[4]);
		n.setRschDy(data[5]);
		n.setExcvArea(data[6]);
		n.setHhldCnt(data[7]);
		n.setRoomCnt(data[8]);
		n.setBathCnt(data[9]);
		n.setTrdTopPrc(Long.parseLong(data[10]));
		n.setTrdBttmPrc(Long.parseLong(data[11]));
		n.setTrdAvgPrc(Long.parseLong(data[12]));
		n.setJnseTopPrc(Long.parseLong(data[13]));
		n.setJnseBttmPrc(Long.parseLong(data[14]));
                tbKabSiseRepository.save(n);

                log.debug("loadKabSise() end...");

        }

	private void etlKabSise(String fileName, int cnt) throws Exception {

                log.info("etlKabSise() start...");

                LineNumberReader in = new LineNumberReader(new FileReader(fileName));

                String s = "";
                int i = 0;
                while((s = in.readLine()) != null) {

                        i++;
                        if(i == 1) continue;
			if(cnt > 0 && i > cnt) break;

                        if(i % 1000 == 0) {
                                log.info("i = " + i);
                        }

                        String[] parts = s.split("\\|");
                        /*
                        for(int j = 0; j < parts.length; j++) {
                                log.info("parts[" + j + "] = " + parts[j]);
                        }*/

                        String[] data = new String[15];
                        for(int j = 0; j < data.length; j++) {
                                if(j == 0) {
                                        data[j] = "" + i;
                                } else {
                                        data[j] = parts[j - 1];
                                }
                        }
                        loadKabSise(data);
                }

                log.info("etlKabSise() end...");
        }

	private void loadOlpr(String[] data) {

                log.debug("loadOlpr() start...");

                TbOlpr n = new TbOlpr();
                n.setPkstr(data[0]);
		n.setTwprcDnjiNo(data[1]);
		n.setTwprcDongNo(data[2]);
		n.setTwprcHoNo(data[3]);
		n.setBasisYm(data[4]);
		n.setLwdgCd(data[5].substring(0, 8));
		n.setStnmAddr(data[6]);
		n.setCityNm(data[7]);
		n.setSgguNm(data[8]);
		n.setEubMyunNm(data[9]);
		n.setDongRiNm(data[10]);
		n.setTwprcBnjiDvcd(data[11]);
		n.setAddrBno(data[12]);
		n.setAddrBuno(data[13]);
		n.setBldgNm(data[14]);
		n.setDtlBldgNm(data[15]);
		n.setBldgHo(data[16]);
		n.setApyArea(data[17]);
		n.setOfntPrc(Long.parseLong(data[18]));
		n.setBldgMngNo(data[19]);
		n.setStnm(data[20]);
		n.setBldgBno(data[21]);
		n.setBldgBuno(data[22]);
                tbOlprRepository.save(n);

                log.debug("loadOlpr() end...");

        }

	private void etlOlpr(String fileName, int cnt) throws Exception {

                log.info("etlOlpr() start...");

                LineNumberReader in = new LineNumberReader(new FileReader(fileName));

                String s = "";
                int i = 0;
                while((s = in.readLine()) != null) {

                        i++;
                        if(i == 1) continue;
			if(cnt > 0 && i > cnt) break;

			// if(i > 10) break;
                        if(i % 1000 == 0) {
                                log.info("i = " + i);
                        }

                        String[] parts = s.split("\\|");
			/*
                        for(int j = 0; j < parts.length; j++) {
                                log.info("parts[" + j + "] = " + parts[j]);
                        }*/

                        String[] data = new String[23];
                        for(int j = 0; j < data.length; j++) {
                                if(j == 0) {
                                        data[j] = parts[0] + "-" + parts[1] + "-" + parts[2];
                                } else {
                                        data[j] = parts[j - 1];
                                }
                        }
                        loadOlpr(data);
                }

                log.info("etlOlpr() end...");
        }

	private void loadEhpr(String[] data) {

                log.debug("loadEhpr() start...");

                TbEhpr n = new TbEhpr();
		n.setEachHsSeq(data[0]);
		n.setBasisYm(data[1]);
		n.setLwdgCd(data[2].substring(0, 8));
		n.setStnmAddr(data[3]);
		n.setCityNm(data[4]);
		n.setSgguNm(data[5]);
		n.setEubMyunNm(data[6]);
		n.setDongRiNm(data[7]);
		n.setSlndCd(data[8]);
		n.setLtnoBno(data[9]);
		n.setLtnoBuno(data[10]);
		n.setBldgArea(data[11]);
		n.setCnldUnqNo(data[12]);
		n.setOfntPrc(Long.parseLong(data[13]));
		n.setBldgMngNo(data[14]);
		n.setStnm(data[15]);
		n.setBldgBno(data[16]);
		n.setBldgBuno(data[17]);
                tbEhprRepository.save(n);

                log.debug("loadEhpr() end...");

        }

	private void etlEhpr(String fileName, int cnt) throws Exception {

                log.info("etlEhpr() start...");

                LineNumberReader in = new LineNumberReader(new FileReader(fileName));

                String s = "";
                int i = 0;
                while((s = in.readLine()) != null) {

                        i++;
                        if(i == 1) continue;
			if(cnt > 0 && i > cnt) break;

                        if(i % 1000 == 0) {
                                log.info("i = " + i);
                        }

                        String[] parts = s.split("\\|");
                        /* 
                        for(int j = 0; j < parts.length; j++) {
                                log.info("parts[" + j + "] = " + parts[j]);
                        }*/

                        String[] data = new String[18];
                        for(int j = 0; j < data.length; j++) {
				data[j] = parts[j];
                        }
                        loadEhpr(data);
                }

                log.info("etlEhpr() end...");
        }

	public void makeEmdJson() throws Exception {

		log.info("makeEmdJson() start...");

		LineNumberReader in = new LineNumberReader(new FileReader("/root/data/emd-list.txt"));
		String s = "";
		TreeSet<String> citySet = new TreeSet<String>();
		HashMap<String, TreeSet<String>> sgguMap = new HashMap<String, TreeSet<String>>();
		HashMap<String, TreeSet<String>> emdMap = new HashMap<String, TreeSet<String>>();

		int i = 0;
		while((s = in.readLine()) != null) {
			i++;
			if(!s.contains("존재")) continue;
			String[] data = s.split(" ");
			citySet.add(data[1]);

			TreeSet<String> sgguSet = sgguMap.get(data[1]);
			if(sgguSet == null) {
				sgguMap.put(data[1], new TreeSet<String>());
			}
			sgguSet = sgguMap.get(data[1]);
			if(!data[2].equals("존재")) {
				sgguSet.add(data[2]);
			}

			TreeSet<String> emdSet = emdMap.get(data[1] + "|" + data[2]);
			if(emdSet == null) {
				emdMap.put(data[1] + "|" + data[2], new TreeSet<String>());
			}
			emdSet = emdMap.get(data[1] + "|" + data[2]);
			if(data.length > 3) {
				if(data[3].endsWith("구")) {
					if(!data[4].equals("존재")) emdSet.add(data[4] + "|" + data[0].substring(0, 8));
				} else {
					if(!data[3].equals("존재")) emdSet.add(data[3] + "|" + data[0].substring(0, 8));
				}
			}
		}

		Gson gson = new Gson();
		String citySetJson = gson.toJson(citySet);
		FileWriter out = new FileWriter("/root/data/citySet.json");
		out.write(citySetJson + "\n");
		out.flush();

		out = new FileWriter("/root/data/sgguMap.json");
		String sgguMapJson = gson.toJson(sgguMap);
		out.write(sgguMapJson + "\n");
		out.flush();

		out = new FileWriter("/root/data/emdMap.json");
		String emdMapJson = gson.toJson(emdMap);
		out.write(emdMapJson + "\n");
		out.flush();

		log.info("makeEmdJson() end...");
 
	}

	public static void main(String[] args) {
		log.info(">>>>>>>>>>>>>>>>>>>");
		for(String arg:args) {
			log.info(">>>" + arg);
		}
		SpringApplication.run(HelloWorld.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		log.info("run() start...");

		for(String arg:args) {
                        log.info("!!!>>>" + arg);
                }

		String work = args[0]; 
		String fileName = args[1]; 
		int cnt = Integer.parseInt(args[2]);

		switch (work) {
			case "emd" :
				makeEmdJson();
				break;
			case "addr":
				etlAddr(fileName, cnt);
				break;
			case "map":
				etlMap(fileName, cnt);
				break;
			case "kbSise":
				etlKbSise(fileName, cnt);
				break;
			case "kabSise":
				etlKabSise(fileName, cnt);
				break;
			case "olpr":
				etlOlpr(fileName, cnt);
				break;
			case "ehpr":
				etlEhpr(fileName, cnt);
				break;
			case "emm" :
				etlEmm();
				break;
		}

		log.info("run() end...");

	}
}
