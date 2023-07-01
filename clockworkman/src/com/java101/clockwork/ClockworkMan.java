package com.java101.clockwork;

/**
 * Class that contains the logic to configure the Clockwork Man.
 *
 * <pre>
 *    @
 *   -w-
 *    A
 *   / \
 * </pre>
 *
 */
public class ClockworkMan {

    private char head;
    private char chest;
    private char torso;
    private Action action;
    private int phase;
    private String speech;

    public ClockworkMan() {
        this('@', 'w', 'A');
    }

    public ClockworkMan(final char head, final  char chest, final char torso) {
        this.head = head;
        this.chest = chest;
        this.torso = torso;
        this.action = Action.IDLE;
        this.phase = 0;
        this.speech = "";
    }

    public void setHead(final char head) {
        this.head = head;
    }


    public void setChest(final char chest) {
        this.chest = chest;
    }


    public void setTorso(final char torso) {
        this.torso = torso;
    }

    public void setSpeech(final String speech) {
        this.speech = speech;
    }

    public String getSpeech() {
        return speech;
    }

    public char[][] getBodyCharArrays() {
        return getBodyCharArrays(false);
    }

    public char[][] getBodyCharArrays(boolean increasePhase) {
        if (increasePhase) {
            phase++;
        }
        final char arms;
        final char leftLeg;
        final char rightLeg;
        switch (action) {
            case IDLE:
                phase = 0;
                arms = '-';
                leftLeg = '/';
                rightLeg = '\\';
                break;
            case LEFT:
                if (phase > 1) {
                    phase = 0;
                }
                arms = '<';
                leftLeg = rightLeg = phase == 0 ? '\\' : '|';
                break;
            case RIGHT:
                if (phase > 1) {
                    phase = 0;
                }
                arms = '>';
                leftLeg = rightLeg = phase == 0 ? '/' : '|';
                break;
            case UP:
                if (phase > 1) {
                    phase = 0;
                }
                arms = '^';
                leftLeg = phase == 0 ? '/' : '|';
                rightLeg = phase == 0 ? '\\' : '|';
                break;
            case DOWN:
                if (phase > 1) {
                    phase = 0;
                }
                arms = 'v';
                leftLeg = phase == 0 ? '/' : '|';
                rightLeg = phase == 0 ? '\\' : '|';
                break;
            default:
                throw new RuntimeException("No arrays defined for " + action);
        }
        return new char[][] {
            {' ', head, ' '},
            {arms, chest, arms},
            {' ', torso, ' '},
            {leftLeg, ' ', rightLeg}
        };
    }

    public void setAction(String action) {
        this.action = Action.valueOf(action.toUpperCase());
        this.phase = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        char[][] body = getBodyCharArrays(false);
        for (int i = 0; i < body.length; i++) {
            sb.append(body[i]);
            if (i == 0 && speech.length() > 0) {
                sb.append(" \"").append(getSpeech()).append("\"");
            }
            sb.append('\n');
        }
        return sb.substring(0, sb.length() - 1);
    }

    enum Action {
        IDLE,
        LEFT,
        RIGHT,
        UP,
        DOWN;
    }

    public static void main(String[] args) {
        final ClockworkMan clockwork = new ClockworkMan('a', 'b', 'c');
        
        System.out.println(clockwork);
        System.out.println();

        clockwork.setAction("right");
        clockwork.setSpeech("manual testing is all I have :(");
        clockwork.setHead('x');
        clockwork.setChest('y');
        clockwork.setTorso('z');

        System.out.println(clockwork);
        System.out.println();

        for (ClockworkMan.Action action: ClockworkMan.Action.values()) {
            System.out.println("We're going " + action.toString().toLowerCase());

            clockwork.setAction(action.toString());

            char[][] phaseOne = clockwork.getBodyCharArrays(true);
            char[][] phaseTwo = clockwork.getBodyCharArrays(true);
            char[][] phaseThree = clockwork.getBodyCharArrays(true);

            if (phaseOne.length != phaseTwo.length || phaseTwo.length != phaseThree.length) {
                throw new RuntimeException("Phases have mismatched lengths!");
            }

            for (int i = 0; i < phaseOne.length; i++) {
                for (int j = 0; j < phaseOne[i].length; j++) {
                    System.out.print(phaseOne[i][j]);
                }
                System.out.print("  ");
                for (int j = 0; j < phaseTwo[i].length; j++) {
                    System.out.print(phaseTwo[i][j]);
                }
                System.out.print("  ");
                for (int j = 0; j < phaseThree[i].length; j++) {
                    System.out.print(phaseThree[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}