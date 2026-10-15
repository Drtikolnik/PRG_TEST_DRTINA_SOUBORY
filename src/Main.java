import org.json.JSONArray;
import org.json.JSONObject;

void main() {

    try {
        Path cesta = Path.of("src/vyprava.json");

        //
        String obsah = Files.readString(cesta);
        JSONObject root = new JSONObject(obsah);
        JSONArray rugs = root.getJSONArray("koberce");
        JSONArray monke = root.getJSONArray("opicky");

        ArrayList<JSONObject> list = new ArrayList<>();
        ArrayList<JSONObject> monkeList = new ArrayList<>();
        ArrayList<JSONObject> rugsList = new ArrayList<>();

        //list
        for (int i = 0; i < rugs.length(); i++) {
            list.add(rugs.getJSONObject(i));
        }
        for(int i = 0; i < monke.length(); i++) {
            list.add(monke.getJSONObject(i));
        }

        //samostatne list
        for (int i = 0; i < rugs.length(); i++) {
            rugsList.add(rugs.getJSONObject(i));
        }

        for(int i = 0; i < monke.length(); i++) {
            monkeList.add(monke.getJSONObject(i));
        }


        //ukoly



        //pocet opicek
        int pocetOpicek = 0;
        for (int i = 0; i < monkeList.size(); i++) {
            pocetOpicek++;
        }
        System.out.println("Počet opiček: " +pocetOpicek);


        //
        for (int i = 0; i < rugsList.size(); i++) {
            JSONObject rug = rugsList.getJSONObject(i);
            System.out.println();
            System.out.print("id: " +rug.getString("id")+ " název: " +rug.getString("nazev")+ " nosnost: " +rug.getString("nosnost"));
            if (rug.getBoolean("aktivni")==true) {
                System.out.println(" aktivní");
            }else{
                System.out.println("volný");
            }


        }

        //



























    } catch (IOException e) {
        throw new RuntimeException(e);
    }



























}