package gamestate;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import assets.Images;

public class Agumon extends JPanel {
    private int choice = 0;
    private int age = 0;
    private int test = 0;
    private int count = 0;
    private int x = 250;
    private int y = 25;
    private int bounce = 461;
    private int xy = 0;
    private int days = 0;
    private volatile int hunger = 0;
    private int meat = 0;
    private int feet = 0;
    private int exist = 0;
    private int state = 0;
    private int chew = 0;


    public void draw(Graphics g) {

        int diff = feet - 30;
        int height = Math.abs(meat - 462);
        int distance = Math.abs(feet - x);


        super.paintComponent(g);
        g.drawImage(Images.Sky, test, 0, 500, 500, null);


        int sleep = (age) % 2;
        int prevAge = age;
        Random lemon = new Random();

        int r = lemon.nextInt(5);


        if (state == 0) {
            if (age <= 50) {
                if (age < 10) {
                    g.drawImage(Images.egg, 250, 460 + (age) % 2, 70, 50, null);
                } else if (age < 20) {
                    g.drawImage(Images.egg_1, 250, 460 + (age) % 2, 70, 50, null);
                } else if (age < 30) {
                    g.drawImage(Images.egg_2, 250, 460 + (age) % 2, 70, 50, null);
                } else if (age < 40) {
                    g.drawImage(Images.egg_3, 250, 460 + (age) % 2, 70, 50, null);
                } else {
                    g.drawImage(Images.egg_4, 250, 460 + (age) % 2, 70, 50, null);
                }
            }

            if (days <= 1) {
                if (age > 50 && exist == 0) {
                    if (r == 0 && x < 470) {
                        x += 10;
                        y += 1;


                    }
                    if (r == 1 && x > 0) {
                        x -= 10;
                        y += 1;


                    }
                    if (r >= 2) {
                        y += 1;


                    }

                    if (r > 1) {
                        if (sleep == 0) {
                            g.drawImage(Images.blinkStand, x, 462, 100, 150, null);
                        }
                        if (sleep == 1) {
                            g.drawImage(Images.b, x, 463, 100, 150, null);
                        }
                    }
                    if (r == 1) {
                        if (sleep == 0) {
                            g.drawImage(Images.blinkLeft, x, 462, 100, 150, null);
                        } else if (sleep == 1) {
                            g.drawImage(Images.Left, x, 463, 100, 150, null);
                        }
                    }
                    if (r == 0) {
                        if (sleep == 0) {
                            g.drawImage(Images.blinkRight, x - 69, 462, 100, 150, null);
                        } else if (sleep == 1) {
                            g.drawImage(Images.Right, x - 69, 463, 100, 150, null);
                        }
                    }
                }

                if (age > 50 && exist > 0) {

                    if (x > diff) {
                        if (distance > 30) {
                            x -= 10;
                            y += 1;
                        }
                        x -= 1;
                        y += 1;


                    }
                    if (x < diff) {
                        if (distance > 30) {
                            x += 10;
                            y += 1;
                        }
                        x += 1;
                        y += 1;


                    }
                    if (x == diff) {
                        y += 1;


                    }

                    if (x == diff) {
                        if (sleep == 0) {
                            g.drawImage(Images.eat, x - 69, 462, 100, 150, null);

                            exist--;

                        }
                        if (sleep == 1) {
                            g.drawImage(Images.Right, x - 69, 463, 100, 150, null);


                        }
                    } else if (x > diff) {
                        if (sleep == 0) {
                            g.drawImage(Images.blinkLeft, x, 462, 100, 150, null);
                        } else if (sleep == 1) {
                            g.drawImage(Images.Left, x, 463, 100, 150, null);
                        }
                    } else if (x < diff) {
                        if (sleep == 0) {
                            g.drawImage(Images.blinkRight, x - 69, 462, 100, 150, null);
                        } else if (sleep == 1) {
                            g.drawImage(Images.Right, x - 69, 463, 100, 150, null);
                        }
                    }
                }
            } else if (days > 1) {
                if (r == 0 && x < 470) {
                    x += 10;
                    y += 1;


                }
                if (r == 1 && x > 0) {
                    x -= 10;
                    y += 1;


                }
                if (r >= 2) {
                    y += 1;


                }

                if (r > 1) {
                    if (sleep == 0) {
                        g.drawImage(Images.agumon_right, x, 475, 20, 25, null);
                    }
                    if (sleep == 1) {
                        g.drawImage(Images.agumon_rightBlink, x, 476, 20, 25, null);
                    }
                }
                if (r == 1) {
                    if (sleep == 0) {
                        g.drawImage(Images.agumon_left, x, 475, 20, 25, null);
                    } else if (sleep == 1) {
                        g.drawImage(Images.agumon_leftBlink, x, 476, 20, 25, null);
                    }
                }
                if (r == 0) {
                    if (sleep == 0) {
                        g.drawImage(Images.agumon_right, x, 475, 20, 25, null);
                    } else if (sleep == 1) {
                        g.drawImage(Images.agumon_rightBlink, x, 476, 20, 25, null);
                    }
                }

            }
        }

        if (state == 1) {
            ArrayList<Image> game = new ArrayList<Image>();
            game.add(Images.rock);
            game.add(Images.paper);
            game.add(Images.scissors);
            g.drawImage(game.get(choice), 220, 250, 100, 125, null);


        }

        drawSun(g);

        age += 1;
        days = age / 30;
        //System.out.println(hunger);
        drawInfo(g);

        g.setColor(Color.BLACK);

        if (exist > 0) {
            g.drawImage(Images.meat, feet, meat, 40, 30, null);
        }

        if (meat < 470) {
            meat += 5;
        }

    }

    private void drawSun(Graphics g) {
        double sunAngle = (age * Math.PI / 2000) % (Math.PI);
        double moonAngle = (age * Math.PI / 2000 + Math.PI / 2) % (Math.PI);

        int sunx = (int) -(Math.cos(sunAngle) * 400) + 250;
        int suny = (int) -(Math.sin(sunAngle) * 400) + 410;
        int moonx = (int) -(Math.cos(moonAngle) * 400) + 250;
        int moony = (int) -(Math.sin(moonAngle) * 400) + 410;

        g.drawImage(Images.Sun, sunx, suny, null);
        g.drawImage(Images.Moon, moonx, moony, null);
        System.out.println(sunAngle);
    }

    private void drawInfo(Graphics g) {
        String lime = "days:" + days + " Hunger:" + hunger;
        g.setColor(Color.WHITE);

        String pim = "Position:" + x + " Meat:" + (feet);
        g.setColor(Color.WHITE);
        g.drawString(lime, 400, 400);
        g.drawString(pim, 350, 450);
    }

    public void Feed() {
        hunger++;
        Random fam = new Random();

        meat = fam.nextInt(200) + 255;
        Random clam = new Random();

        feet = clam.nextInt(455);

        repaint();
        exist = 10;
        days++;
    }

    public void Game() {
        state = 1;
        Random ham = new Random();

        choice = ham.nextInt(3);
    }


}

