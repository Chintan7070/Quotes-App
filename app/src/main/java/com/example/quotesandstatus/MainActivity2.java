package com.example.quotesandstatus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.quotesandstatus.My_Adapter2.My_Adapter22;

public class MainActivity2 extends AppCompatActivity {

    String[] Atti_shayari={"जब जान प्यारी थी तो दुश्मन हज़ारों अब मरने का शौक हुआ तो क़ातिल नही मिलते.","शरीफ़ थे तो नहीं बोले, अगर थोड़े भी बेशर्म होते…बराबर की टक्कर देते","जो जाते हैं आगे जाने दो, सबको पीछे छोडुंगा वक्त आने दो…","मैं हमदर्दी की ख़ैरातों के सिक्के मोड़ देता हूँ,\n" +
            "जिस पर बोझ बन जाउँ, उसे मैं ख़ुद ही छोड़ देता हूँ।","जुबान खराब नहीं विचार कड़क है..रंगो में नही सोच में फर्क है…","कोई मुझसे जलता है ये भी मेरे लिए सफलता है..","अगर फितरत हमारी सहने की नहीं होती तो हिम्मत तुम्हारी कुछ कहने की नहीं होती..","Ⓜaine bhi badal diya apne zindagi ke usul, Ab jo yaad karega woh yaad rahega..","Ek ajeeb sa khauf tha us shaar ki ankhon me., Jisne jangal maa hamary jooton ky nishaan dekhy thi..","Vaqt ~ vaqt ki baat hoti hai. aaj aapka hai ood leejie.. kal hamara hoga. to sidha uda denge..","Papa ki parichayi..? Ma ka hero, Doston ki shaan, Gf ki jaan., yahi to hai hamari ki pehchaan…\n" +
            "\n","Badaam se behtar dhokha hai “jithna khaonge utni hi akhal aayengi”..\n" +
            "\n","Jisko jaana hai vo chala jaata hai use hame rone se bhi koi pharq nahi padtha.","Agar tu ye sochthi hai teri khubsurathi me dam hai, pagli log bhi tujhe isliye dekhthe hai kyu ki tere Ashiq ham hai","Mujhe parvaah nahi hai ki log mere bare mein kya sochthe hai ya kya kehthe hai, main is dharathi par har kisee ko khush karne ke liye paida nahi hua tha.."};
    int[] Atti_img2={R.drawable.atti1,R.drawable.atti2,R.drawable.atti3,R.drawable.atti4,R.drawable.atti5,R.drawable.atti6,R.drawable.atti7,R.drawable.atti8,R.drawable.atti17,R.drawable.atti10,R.drawable.atti11,R.drawable.atti12,R.drawable.atti13,R.drawable.atti14,R.drawable.atti15};


    String[] inspi={"You are never too old to set another goal or to dream a new dream.\n" +
            "\n","Once you learn how to create your own, Happiness, no one can take it from you.","Be a good person, but don't waste time trying to prove it.","Choose your habits carefully ,they decide your future","Hard work always important for success,But smart work will make you best. ","Sometimes later becomes never.Do it now.","Great People, they don't Cry, They Try.","The journey is yours, Enjoy each and every step."};
    int inspi_img[]={R.drawable.inspiration111,R.drawable.inspiration111,R.drawable.inspiration111,R.drawable.inspiration111,R.drawable.inspiration111,R.drawable.inspiration111,R.drawable.inspiration111,R.drawable.inspiration111};


    String[] succ={"It’s my turn you\n Just watch and learn","7 billion people\n 14 billion faces","Learn to survive alone\n" +
            "Before life teaches you\n How to do it","Every villain is a hero\n" +
            "In his own mind","Dreams Don’t work\n" +
            "Unless you do","No love no pain\n" +
            "Stay single only gain","Confuse them with your silence\n" +
            "Shock them with your action","Today’s Pain becomes\n" +
            "Tomorrow’ strength","You can’t win in life\n" +
            "If you’re losing in your mind","The thing you can do is maintain\n" +
            "Your mystery"};
    int succ_img[]={R.drawable.success,R.drawable.success,R.drawable.success,R.drawable.success,R.drawable.success,R.drawable.success,R.drawable.success,R.drawable.success,R.drawable.success,R.drawable.success};

    String[] money={"Money is a paper, people live for these papers.","Rich – Money is not everything, Poor – Money is everything.","You are not good looking, So what? You have enough money to buy beauty.","Use your wisdom, don’t run after money, let money run after you.","Fool and money can’t stay together for a long time.","Health is wealth, don’t lose either.","Talent will never starve to death.","A money will drive you everywhere, just smile and travel anywhere.","Time and money, both can teach you the best lesson.Time and money, both can teach you the best lesson.","Money is a joke, have it and laugh, lose it and cry."};
    int[] money_img={R.drawable.money,R.drawable.money,R.drawable.money,R.drawable.money,R.drawable.money,R.drawable.money,R.drawable.money,R.drawable.money,R.drawable.money,R.drawable.money,};


    String student[]={"Your future always depends On what You have done Today!","Falling down is also The most Important, It shows people Who they Really Are!","You cannot change your future, but, you can change your habits, and surely your habits will change your future!","The weak People can never forgive. Forgiveness is the symptom of strong People!","Arise, awake, and stop not until the goal is achieved!","Your Best Teacher is Your Last Mistake!","Take risks in life, If you win you'll Rise, If you Lose, You'll Guide!","Strength Doesn't come from Physical Powers, It Comes from Undefeatable Will!","The Gear Of Success is The Fear Of Your Life!","It often requires more courage to dare to do right than to fear to do Wrong!"};
    int stud_img[]={R.drawable.student,R.drawable.student,R.drawable.student,R.drawable.student,R.drawable.student,R.drawable.student,R.drawable.student,R.drawable.student,R.drawable.student,R.drawable.student};


    String posit[]={"Intzaar karne walon ko sirf utna hi milta hai\n" +
            "jitna ki koshish karne wale chord dete hai","Vikalp milege bahut Marg bhatkane ke liye\n" +
            "Sankalp ek hi kafi hai Manjil tak jane ke liye","Mujhko kya drayega maut ka manzar\n" +
            "Hm to paida hi katilon ki gli me hue hai","Judaai ka har lamha kuch yu guzara hai humne\n" +
            "Tum aaoge Tum aane wale ho Tum aa jao shayad","Hamdardi na karo mujh se aye hamdard dosto\n" +
            "Wo bhi bare hamdard the jo dard hazaron dey gye","Mere Alfazo Ko sunne Wale To Hazaro Hai\n" +
            "Par Meri Khamoshi Ko Samjhne Wala Ek Bhi Nahi","Mere maut ki khabar usse btana magar in alfazo me\n" +
            "Tumhara jo Sadiyo se arman tha aaj wo pura ho gaya","pyar me ab yeh shamil karna hai,\n" +
            "vo sach kahe na kahe,\n" +
            "hume atbaar karna hain"};
    int posi_img[]={R.drawable.positive,R.drawable.positive,R.drawable.positive,R.drawable.positive,R.drawable.positive,R.drawable.positive,R.drawable.positive,R.drawable.positive};


    String[] roman={"Kabhi udaas ho jayo to btana mujhe\n" +
            "fir se apna dil denge tumhe khelne k liye","Mile to hazaron log the Zindagi me ,\n" +
            "Par wo sabse alag tha jo kismat me nahi tha...","Soch milni chahiye\n" +
            "dil toh apne aap hi mil jaate hai.!","Aapki adaao ki\n" +
            "Kya jaroorat hai \n" +
            "Hum toh fida hi\n" +
            "Aapki saadgi par hai","Zindagi khoobsurat\n" +
            "Lagne lagti hai\n" +
            "Jab aap paas bhi ho\n" +
            "Aur sath bhi ho..!","Tu mujhe khayal mee nahi\n" +
            "Naye har saal mee chahiye..!","Yu hi hum\n" +
            "Haar nahi maanenge\n" +
            "Tere liye sabko\n" +
            "Choud diya hai maine\n" +
            "\n","Tere hone se\n" +
            "Madhoosh ho jaate hai\n" +
            "Jab tu dekhti hai\n" +
            "Hum behoos ho jaate hai","Ae khuda bas itna\n" +
            "Rehem karde jitni zindagi\n" +
            "Unke begair hai\n" +
            "Tu usse kum karde…!"};
    int roman_img[]={R.drawable.romantic,R.drawable.romantic,R.drawable.romantic,R.drawable.romantic,R.drawable.romantic,R.drawable.romantic,R.drawable.romantic,R.drawable.romantic};


    String[] love={"Aapko chaha toh\n" +
            "Mohabbat samajh aagayi\n" +
            "Warna iss lafz ki\n" +
            "Taarif suna karta tha mai","Mere labo ko aapke labo ka\n" +
            "sahara chahiye\n" +
            "Thoda nahi pyar hame aapka\n" +
            "poora chahiye..!","Main tumko hamesha ke liye\n" +
            "Bhula dunga\n" +
            "Jab tum mujhse jyada chahne wale se\n" +
            "Milwa dogi..!","Unhone poocha ki\n" +
            "Tumhare dil mee kya hai\n" +
            "Maine kaha ki\n" +
            "Kuch nahi sivaay tumhare..!","Aap hamari wo\n" +
            "Aadat ban gayi ho \n" +
            "Jisse badalne mee\n" +
            "Sadiya beet jaayengi..!","Hai ishq toh phir\n" +
            "Asar bhi hoga\n" +
            "Jitna idhar hai utna\n" +
            "Udhar bhi hoga..!","Dil jaan se karenge\n" +
            "Hifaazat unki \n" +
            "Bas ek baar kehde\n" +
            "Amannat hu teri..!","Ek teri hi\n" +
            "Khwaish hai mujhko \n" +
            "Kayanaat kisne maangi hai…!"};
    int[] love_img={R.drawable.love,R.drawable.love,R.drawable.love,R.drawable.love,R.drawable.love,R.drawable.love,R.drawable.love,R.drawable.love};

    String[] fest={"My Dear Brother Is OneOf The Most PreciousGift Sent By God.Happy Raksha Bandhan To You.","Phoolon Ka Taron Ka Sabka Kehna Hai,Ek Hazaron Mein Mere Bhaiya Hai…Luv U Always. “Happy Raksha Bandhan.","Sky Is Blue,Feel This Hue,My Love Is For You Bhaiya…Always True.Loads Of Good Wishes For Raksha Bandhan.","Holi Is Colorful,Diwali Is Lightful And Brightful,Rakhi Has Made Our Relationship Powerful.","I’m Proud ThatThe Distance Between UsHas Only ProvedHow Strong Our Bond Is,And Will Forever Be.","I Want 2 Tell U,During The Times When We Fought,My Love Was In A Different Mood.Happy Raksha Bandhan Sweety!","Na Card Bhej raha HunNa Koi Phool Bhej raha HunSirf Sache Dil SeMein Kehta Hun Apko","May All The Sweet MagicOf Christmas ConspireTo Gladden Your HeartsAnd Fill Every Desire.",};
    int fest_img[]={R.drawable.festival,R.drawable.festival,R.drawable.festival,R.drawable.festival,R.drawable.festival,R.drawable.festival,R.drawable.festival,R.drawable.festival};

    String[]fri={"\"Dost ke bagair ghar hi nahi, puri duniya hi suni lagti hai. \"\"Dost ke sath kal ki fikr nahi hoti hai. \"\"Mere aksar naye dost ban jaate hai, Jab unhe mujh se kaam hota hai.\"","\"Apni zindagi ko apna dost bana liya, Kya kamal ka maine ye faisla liya.\"","\"Jiske sath pahle mulakat achhi nahi hoti, Unke sath dosti kamal ki hoti hai. \"","\"Dosti wo hai, Jo zindagi ko aur mazedaar banati hai.\"\n" +
            "\n","\"Dost rishtedaar nahi hote, Unse badh ke hote hai. \"\n" +
            "\n","\"Bahut khaas hai mere dost, shayad isiliye jitne the ab tak hai.\"\n" +
            "\n","\"Jinke zindagi me dost nahi hai, wo khali nahi khokhli hai.\"\n" +
            "\n","\"Hum har hade paar kar sakte hai, Par dosti ki lakiren nahi.\"\n" +
            "\n"};
    int fri_img[]={R.drawable.friends11,R.drawable.friends11,R.drawable.friends11,R.drawable.friends11,R.drawable.friends11,R.drawable.friends11,R.drawable.friends11,R.drawable.friends11};


    String[] god={"With God all things are possible.\n" +
            "\n","I will thank God for the day and the moment I have.\n" +
            "\n","I can find God in nature, in birds, in the environment, and animals.\n" +
            "\n","I am as bad as the worst, but, thank God, I am as good as the best.\n" +
            "\n","Stop telling God how big your storm is. Instead, tell the storm how big your God is.\n" +
            "\n","God never ends anything on a negative; God always ends on a positive.\n" +
            "\n","God is not a cosmic bellboy for whom we can press a button to get things.\n" +
            "\n","Achievements are accomplished through difficulties.\n" +
            "\n"};
    int god_img[]={R.drawable.god,R.drawable.god,R.drawable.god,R.drawable.god,R.drawable.god,R.drawable.god,R.drawable.god,R.drawable.god};


    String[] gn={"Touch your heart\n" +
            "close your eyes\n" +
            "make a wish & say.\n" +
            "Good Night.","Let this amazing night\n" +
            "take you on a ride\n" +
            "of beautiful dreams.\n" +
            "Good Night.","I wish i had been there\n" +
            "to hold you tight\n" +
            "instead of merely saying.\n" +
            "Good Night.","No matter what kind of mess\n" +
            "life put you through today,\n" +
            "tomorrow will always be a new day.\n" +
            "Good Night","Life always offers you\n" +
            "a second chance\n" +
            "it’s called tomorrow.\n" +
            "Good Night.","Throw off your worries when you\n" +
            "throw off your clothes at night.","One day, I shall rule the world,\n" +
            "until then I am going to bed.\n" +
            "Good Night.",""};
    int gn_img[]={R.drawable.good_night,R.drawable.good_night,R.drawable.good_night,R.drawable.good_night,R.drawable.good_night,R.drawable.good_night,R.drawable.good_night,R.drawable.good_night};



    private RecyclerView rc_view2;
    private My_Adapter22 adapter22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int ps = getIntent().getIntExtra("ps",0);

        rc_view2=findViewById(R.id.rc_view2);


        switch(ps)
        {
            case 0:
                 adapter22=new My_Adapter22(MainActivity2.this,Atti_shayari,Atti_img2);
                 break;

            case 1:
                adapter22=new My_Adapter22(MainActivity2.this,inspi,inspi_img);
                break;

            case 2:
                adapter22=new My_Adapter22(MainActivity2.this,succ,succ_img);
                break;

            case 3:
                adapter22=new My_Adapter22(MainActivity2.this,money,money_img);
                break;

            case 4:
                adapter22=new My_Adapter22(MainActivity2.this,student,stud_img);
                break;

            case 5:
                adapter22=new My_Adapter22(MainActivity2.this,posit,posi_img);
                break;

            case 6:
                adapter22=new My_Adapter22(MainActivity2.this,roman,roman_img);
                break;

            case 7:
                adapter22=new My_Adapter22(MainActivity2.this,love,love_img);
                break;

            case 8:
                adapter22=new My_Adapter22(MainActivity2.this,fest,fest_img);
                break;

            case 9:
                adapter22=new My_Adapter22(MainActivity2.this,fri,fri_img);
                break;

            case 10:
                adapter22=new My_Adapter22(MainActivity2.this,god,god_img);
                break;

            case 11:
                adapter22=new My_Adapter22(MainActivity2.this,gn,gn_img);
                break;



        }

        RecyclerView.LayoutManager layoutManager2=new GridLayoutManager(this,2);
        rc_view2.setAdapter(adapter22);
        rc_view2.setLayoutManager(layoutManager2);
    }
}