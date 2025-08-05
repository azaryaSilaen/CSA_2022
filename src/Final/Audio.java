package Final;/*
Author: Azarya Silaen
 */

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class Audio {


  static void playSound (File sound) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {

          Clip clip = AudioSystem.getClip();
          clip.open(AudioSystem.getAudioInputStream(new File(sound + ".wav")));
          clip.start();
          Thread.sleep(clip.getMicrosecondLength()/1000);
  }



}
