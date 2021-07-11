package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
       Music music=context.getBean("MusicBean",Music.class);
       Music music1=context.getBean("MusicBean2",Music.class);
     MusicPlayer musicPlayer=new MusicPlayer(music);
     MusicPlayer musicPlayer1=new MusicPlayer(music1);
       System.out.println(musicPlayer.music.getSong());
       System.out.println(musicPlayer1.music.getSong());
       MusicPlayer musicPlayer2 = context.getBean("MusicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer2.music.getSong());
    context.close();
    }
}
