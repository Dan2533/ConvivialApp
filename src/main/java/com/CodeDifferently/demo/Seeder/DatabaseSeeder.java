package com.CodeDifferently.demo.Seeder;

import com.CodeDifferently.demo.Model.Image;
import com.CodeDifferently.demo.Service.ImageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder {
    @Autowired
    ImageServiceImpl imageServiceImpl;

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        seedImageTable();
    }

    private void seedImageTable() {
        Image image1 = new Image(1l, "Dirt Ecosystem", "https://www.julieseatsandtreats.com/wp-content/uploads/2020/07/Dirt-Cups-9-of-9-682x1024.jpg", "https://www.julieseatsandtreats.com/dirt-cups/");
        imageServiceImpl.selectImage(image1);

        Image image2 = new Image(2l, "Monster Cookies", "https://moderncrumb.com/wp-content/uploads/2020/05/monster-cookies-peanut-butter-oatmeal-mms-04-666x1024.jpg", "https://moderncrumb.com/chewy-monster-cookies/");
        imageServiceImpl.selectImage(image2);

        Image image3 = new Image(3l, "Pretzel Letters and Numbers","https://www.whatdowedoallday.com/wp-content/uploads/2009/05/soft-pretzel-shapes.jpg" ,"https://www.whatdowedoallday.com/cooking-by-numbers/");
        imageServiceImpl.selectImage(image3);

        Image image4 = new Image(4l,"Dominoes Cookies Counting Activity", "https://www.learning4kids.net/wp-content/uploads/2014/07/2Dominoes-cookies-counting-activity.jpg","https://www.learning4kids.net/2014/06/03/counting-activity-dominoes-cookies/");
        imageServiceImpl.selectImage(image4);

        Image image5 = new Image(5l,"Funny Face Pizzas", "https://tone-and-tighten.com/wp-content/uploads/2015/10/Funny-Face-Pizzas-on-Tone-and-Tighten.com_.jpg","https://tone-and-tighten.com/funny-face-pizzas.html");
        imageServiceImpl.selectImage(image5);

        Image image6 = new Image(6l,"Ocean Zones in a Jar","https://www.icanteachmychild.com/wp-content/uploads/2014/05/Ocean-zones-the-layers-of-an-ocean-in-a-jar-500x921.jpg","https://www.icanteachmychild.com/make-ocean-zones-jar/");
        imageServiceImpl.selectImage(image6);

        Image image7 = new Image(7l,"How to Make a Lemon Battery","https://kidsactivitiesblog--o--com.follycdn.com/wp-content/uploads/2013/05/Lemon-Battery-Science-Experiment-683x1024.jpg","https://kidsactivitiesblog.com/28028/lemon-battery");
        imageServiceImpl.selectImage(image7);

        Image image8 = new Image(8l,"Herbarium Collection","https://i1.wp.com/laplumedeloiseaulyre.com/wp-content/uploads/2020/04/92023056_540879363491364_4590836434696404992_n.jpg?resize=768%2C1024","http://laplumedeloiseaulyre.com/?p=10464");
        imageServiceImpl.selectImage(image8);

        Image image9 = new Image(9l,"Popsickle Stick Bird Feeder","https://cdn.shortpixel.ai/client/q_glossy,ret_img,w_700/https://www.madewithhappy.com/wp-content/uploads/Popsicle-Stick-Bird-Feeder-19.jpg","https://www.madewithhappy.com/popsicle-stick-bird-feeder/");
        imageServiceImpl.selectImage(image9);

        Image image10 = new Image(10l,"Toilet Paper Roll Car","http://4.bp.blogspot.com/-l5WSH61Yfp0/VdVerqHL0KI/AAAAAAAAPsE/abG1hh_Jt-A/s1600/Toilet%2BPaper%2BRoll%2BCar%2BCraft%2BA%2BLittle%2BPinch%2Bof%2BPerfect%2B5%2Bcopy.png","https://alittlepinchofperfect.com/toilet-paper-roll-car-craf/");
        imageServiceImpl.selectImage(image10);
    }
    }

