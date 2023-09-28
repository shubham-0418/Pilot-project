package com.util;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ScreenShots {
	
	void screencapture(String sstloc1)throws AWTException, IOException {
		Robot robot = new Robot();
		Dimension scr_size = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(scr_size);
		BufferedImage scrshot = robot.createScreenCapture(rect);
		File dest = new File(sstloc1);
		ImageIO.write(scrshot, "png", dest);
	}
}
