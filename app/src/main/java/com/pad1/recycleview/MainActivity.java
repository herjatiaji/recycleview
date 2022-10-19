package com.pad1.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Item> item= new ArrayList<>();
    private ItemAdapter itemadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();

        itemadapter = new ItemAdapter(this,item);
        recyclerView = findViewById(R.id.rv_item);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(itemadapter);
    }
    private void addData(){
        item.add(new Item("M. Soeharto, Presiden Indonesia (1967 – 1998)", "Peringkat utama untuk presiden terkorup di dunia, diduduki oleh pemimpin Orde Baru, M. Soeharto.\n" +
                "\n" +
                "Presiden kedua tanah air ini menjabat sebagai pemimpin Indonesia di tahun 1967 dan memerintah selama 31 tahun lamanya.\n" +
                "\n" +
                "Orde Baru yang dipimpin Suharto dilandasi oleh pemerintahan yang berbasis militer sangat kuat dan ketat, dimana pada akhirnya berhasil menjaga stabilitas negara untuk beberapa tahun.\n" +
                "\n" +
                "Sayangnya, pada pertengahan era 90-an, organisasi otoritarianisme yang berkembang, ditemani dengan kasus korupsi yang semakin menjalar menjadi akhir dari popularitas Suharto.\n" +
                "\n" +
                "Karena hal di ataslah lahir lah istilah KKN yang berarti Korupsi, Kolusi, dan Nepotisme.\n" +
                "\n" +
                "Pada masa kepemerintahannya, Suharto disebut-sebut meraup dana sebesar US$15 sampai US$35 milyar.",R.drawable.soeharto));
        item.add(new Item("Ferdinand Marcos, Presiden Filipina (1965 – 1986)", "Pada posisi kedua presiden terkorup sedunia, ada Ferdinand Marcos dari Filipina.\n" +
                "\n" +
                "Presiden kesepuluh ini memimpin negaranya secara ketat, tidak memberikan celah bagi siapapun yang coba menantangnya.\n" +
                "\n" +
                "Ini dikarenakan ancaman kelompok komunis yang dirumorkan berkembang di bawah kekuasaanya.\n" +
                "\n" +
                "Untuk menghentukan pergerakkan tersebut, Ferdinand menetapkan martial law, hukum yang membuat sebuah negara berada di bawan kontrol militer secara sepenuhnya.\n" +
                "\n" +
                "Hukum ini menciptakan kesengsaraan yang tak berujung untuk rakyat Filipina selama hampir satu dekade…\n" +
                "\n" +
                "…sampai kelompok People Power Revolution berhasil menggulingkan rezim Ferdinand Marcos pada tahun 1986, membuat Ferdinand ketakutan dan kabur ke Amerika Serikat.\n" +
                "\n" +
                "Dilansir dari forbes.com, jumlah uang yang dikorupsi Ferdinand menumpuk sebesar US$10 milyar.",R.drawable.ferdinan));
        item.add(new Item("Mobutu Sese Seko, Presiden Republik Kongo (1965 – 1997)", "Sama seperti Sani Abacha, selain menjadi presiden terkorup dunia, Mobutu Sese Seko juga pandai dalam hal menggulingkan rezim pemerintahan sebelumnya.\n" +
                "\n" +
                "Lahir di keluarga militer, Mobutu Sese Seko memimpin pergerakan kudeta untuk merubuhkan kejayaan Patrice Lumumba…\n" +
                "\n" +
                "…yang mana pada saat itu menjabat sebagai presiden Republik Kongo yang berbasis demokrat.\n" +
                "\n" +
                "Dengan mendeklarasikan regime d’exception, dia melumpuhkan semua jenis kekuatan dalam jajaran kepemerintahannya demi memegang kuasa absolut untuk 32 tahun.\n" +
                "\n" +
                "Di tengah-tengah kekuasaannya, dia berhasis mencuri uang sebanyak US$4 sampai US$5 milyar dari tabungan pajak masyarakat.",R.drawable.mobu));
        item.add(new Item("Sani Abacha, Presiden Nigeria (1993 – 1998)", "Presiden terkorup berikutnya dikenal sebagai sosok yang mahir memimpin beberapa gerakan kudeta di Nigeria.\n" +
                "\n" +
                "Dia menggulingkan masa kejayaan Chief Ernest Shonekanon pada Agustus 1993, dan disebut-sebut sebagai sosok penting dalam kudeta Nigeria beberapa tahun sebelum ia menjadi seornag presiden…\n" +
                "\n" +
                "…tepatnya pada tahun 1966, 1983, dan 1985.\n" +
                "\n" +
                "Sebelum diangkat sebagai presiden, Sani Abacha berjanji akan memimpin Nigeria secara demokratis, tapi kenyataan justru sebaliknya.\n" +
                "\n" +
                "Setahun setelah jabatan kepresidenannya di sahkan, Sani mengambil alih total gerakan militer, melarang pergerakan aktivis, dan mengontrol media masa.\n" +
                "\n" +
                "Menurut majalah Forbes, jumlah harta yang dikorupsi Sani mencapai US$5 milyar.",R.drawable.sani));
        item.add(new Item("Slobodan Milosevic, Presiden Serbia dan Yugoslavia (1989 – 2000)", "Slobodan Milosevic menjalankan tugas sebagai presiden Serbia selama dua masa jabatan sebelum pindah menjadi presiden Yugoslavia. Slobodan tersohor dengan perannya sebagai raja perang di Yugoslavia, dimana dia bertingkah sebagai pimpinan pasukan yang membantai banyak rakyat Kosovo, Kroasia, dan Bosnia.\n" +
                "\n" +
                "The International Criminal Tribunal for the former Yugoslavia (ICTY) sempat menangkap Slobodan dan menjatuhkan hukuman berat atas tindakan kejahatannya terhadap kaum manusia. Selain memulai peperangan besar, Slobodan juga dikabarkan sempat melakukan kerja sama ilegal yang memberikan ia harta sebanyak US$300 juta sampai US$1 milyar.",R.drawable.slobo));
        item.add(new Item("Jean Claude Duvalier, Presiden Haiti (1971 – 1986)", "Jean Claude “Baby Doc” Duvalier mewarisi tahta kepresidenan pada usia 19 tahun dari sang ayah, Francois “Papa Doc” Duvalier pada April 1971.\n" +
                "\n" +
                "Duvalier Jr. disematkan sebagai presiden terkorup karena pada masa jabatannya, ia meneruskan rangkaian teror yang dijalankan sang ayah…\n" +
                "\n" +
                "…termasuk pasukan Tonton Macoutes yang aktif menjarah jutaan harta warga yang pada saat itu sudah jatuh miskin.\n" +
                "\n" +
                "Selama masa pemerintahannya, Jean Claude dikabarkan mengantongi uang rakyat sebesar US$300 sampai US$800 juta.\n" +
                "\n" +
                "Dana tersebut belum termasuk uang bantuan dari negara lain yang dialirkan untuk Haiti demi membantu pembangunan negara.",R.drawable.jean));
        item.add(new Item("Alberto Fujimori, Presiden Peru (1990 – 2000)", "Lahir dari seorang imigran asal Jepang, Alberto Fujimori adalah presiden Peru yang ke-45.\n" +
                "\n" +
                "Selama masa menjabat, Alberto diberi gelar strongman karena berhasil menekan jumlah terorisme di Peru dan membangkitkan sistem perekonomiannya yang sedang memburuk.\n" +
                "\n" +
                "Akan tetapi, dibalik jasanya, sebuah laporan yang dikeluarkan oleh sejarawan Alfonso Quiroz menyatakan bahwa Alberto menyelip sekitar US$1.5  sampai US$4 milyar ke dalam kantungnya…\n" +
                "\n" +
                "…Yang mana dari jumlah tersebut, sekitar US$ 600 juta diambil dari dana masyarakat.\n" +
                "\n" +
                "Hal ini menempatkan Alberto di posisi pertama untuk presiden terkorup dalam sejarah Peru.",R.drawable.alberto));


    }}