public class thir {
    public static void main(String[] args) {
        String[] words = {"stop", "stop", "stop", "stop", "stop"};
        boolean flag = true;
        int max = 0;
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].substring(0) !=words[i + 1].substring(0))flag = false;
        }
        if (flag) {
            for (int i = 0; i < words.length; i++)
                if (words[i].length() > max) {
                    max = words[i].length();
                    System.out.println(max);
                } else System.out.println(1);
        }
    }
}


