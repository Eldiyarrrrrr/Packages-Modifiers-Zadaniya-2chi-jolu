public class Country {
    private String name;
    private int kalky;
    private int ayanty;
    private String tili;

    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKalky() {
        return kalky;
    }

    public void setKalky(int kalky) {
        this.kalky = kalky;
    }

    public int getAyanty() {
        return ayanty;
    }

    public void setAyanty(int ayanty) {
        this.ayanty = ayanty;
    }

    public String getTili() {
        return tili;
    }

    public void setTili(String tili) {
        this.tili = tili;
    }


    public static int maxAyanty(int[] countries) {

        int num = countries[0];
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] > num){
                num = countries[i];

            }

        }
        System.out.print("En chon ayant: ");
        return num;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", kalky=" + kalky +
                ", ayanty=" + ayanty +
                ", tili='" + tili + '\'' +
                '}';
    }
}
