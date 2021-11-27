package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Harimau;
import simple.example.hewanpedia.model.Macan;
import simple.example.hewanpedia.model.Singa;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Singa> initDataSinga(Context ctx) {
        List<Singa> singas = new ArrayList<>();
        singas.add(new Singa("Panthera leo bleyenberghi", "Zaire",
                "Singa besar ini mampu mencapai berat hingga 280 kilogram", R.drawable.singa_katanga));
        singas.add(new Singa("Panthera leo azandica", "Kongo",
                "Singa Kongo dicirikan oleh panjangnya yang berkisar antara 2,5 meter sampai atau 2,8 meter. Selain itu, subspesies singa ini dapat memiliki berat antara 150 dan 190 kg", R.drawable.singa_kongo));
        singas.add(new Singa("Panthera leo krugeri", "Afrika Selatan",
                "Singa Afrika ini adalah varietas dari bagian selatan Afrika dan dianggap sebagai saudara singa Katanga", R.drawable.singa_transvaal));
        singas.add(new Singa("Panthera leo leo", "Hutan Afrika",
                "Subspesies ini merupakan salah satu yang terbesar, ditandai dengan surai besar dan suburnya", R.drawable.singa_barbary));
        singas.add(new Singa("Panthera leo nubica", "Afrika Timur",
                "Bobot tubuhnya sama dengan spesies singa pada umumnya, yaitu antara 150 hingga 200 kg", R.drawable.singa_afrika_timur));
        singas.add(new Singa("Panthera leo persica", "India",
                "Varietas ini lebih kecil dari jenis singa lainnya dan memiliki bulu yang lebih terang, dengan surai kemerahan pada pejantan", R.drawable.singa_asia));
        return singas;
    }

    private static List<Macan> initDataMacan(Context ctx) {
        List<Macan> macans = new ArrayList<>();
        macans.add(new Macan("Panthera pardus kotiya", "Sri Lanka",
                "Macan tutul ini memiliki bulu kuning kecoklatan atau berkarat dengan warna merah jambu dan bintik-bintik gelap", R.drawable.macan_srilanka));
        macans.add(new Macan("Panthera pardus melas", "Jawa, Indonesia",
                " Macan tutul ini benar-benar hitam karena fenotipe resesif atau memiliki bulu berbintik biasa", R.drawable.macan_jawa));
        macans.add(new Macan("Panthera pardus delacouri", "Cina Selatan dan Asia Tenggara",
                "Macan tutul Indochina muncul dalam bentuk yang didominasi warna hitam", R.drawable.macan_indoochina));
        macans.add(new Macan("Panthera pardus orientalis", "Tenggara Rusia dan Timur Laut Cina",
                "Hewan ini berbeda dari subspesies macan tutul lainnya karena bulunya yang tebal dan tertutup bintik yang cocok untuk bertahan hidup di iklim dingin tempat macan tutul ini hidup", R.drawable.macan_amur));
        macans.add(new Macan("Panthera pardus japonensis", "Tiongkok Utara",
                "Macan tutul ini berukuran kira-kira sama dengan macan tutul Amur. Namun bulu mereka lebih gelap dan lebih berwarna oranye", R.drawable.macan_cina_utara));
        macans.add(new Macan("Panthera pardus ciscaucasica", "Kaukasus",
                "Subspesies macan tutul terbesar dan berasal dari wilayah Kaukasus di mana jangkauannya meliputi Turkmenistan, Azerbaijan, Iran, dan Afghanistan barat", R.drawable.macan_persia));
        return macans;
    }

    private static List<Harimau> initDataHarimau(Context ctx) {
        List<Harimau> harimaus = new ArrayList<>();
        harimaus.add(new Harimau("Bengal", "India",
                "Harimau ini memiliki bulu oranye dengan jumbai putih di sekitar telinga dan garis-garis hitam di bagian belakang, dan ia memiliki rahang yang kuat, kaki belakang dan cakar depan kuat", R.drawable.harimau_bengal));
        harimaus.add(new Harimau("Indochina", "Indochina Asia (Perbukitan atau Gunung)",
                "Harimau Indocina ini memiliki ukuran tubuh yang lebih kecil. Selain itu juga memiliki warna bulu yang lebih gelap", R.drawable.harimau_indocina));
        harimaus.add(new Harimau("Himalayan", "Semenanjung Malaysia",
                "Harimau Malaya memiliki banyak kemiripan dengan harimau Indochina", R.drawable.harimau_malaya));
        harimaus.add(new Harimau("Panthera tigris", "Sumatera, Indonesia",
                "Harimau ini termasuk ke dalam harimau yang berukuran kecil. Ukuran tubuhnya untuk jantan mencapai 250 centimeter  sedangkan betina 198 cm", R.drawable.harimau_sumatera));
        harimaus.add(new Harimau("Siberia", "Siberia",
                "Panjang ukuran rata-ratanya sekitar 5 – 7 kaki, dan beberapa jantan bisa mencapai 10 kaki atau lebih. Yang terberat dalam catatan adalah 273Kg", R.drawable.harimau_siberia));
        harimaus.add(new Harimau("Cina Selatan", "Hutan Cina Selatan",
                "Harimau Cina Selatan adalah spesies yang sangat langka. Bisa dibilang spesies ini terancam punah. Hanya tersisa 30 – 40 ekor, dan semuanya ada di kebun binatang", R.drawable.harimau_cinaselatan));
        return harimaus;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataSinga(ctx));
        hewans.addAll(initDataMacan(ctx));
        hewans.addAll(initDataHarimau(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
