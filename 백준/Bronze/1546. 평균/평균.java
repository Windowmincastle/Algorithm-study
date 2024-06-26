import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        double score[] = new double[n];
        double avg = 0;
        double max = 0;
        double sum = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            score[i] = Double.parseDouble(st.nextToken());
            if (score[i] > max) max = score[i];
        }

        for (int i = 0; i < score.length; i++) {
            score[i] = (score[i]/max) * 100;
            sum += score[i];
        }

        avg = sum / n;
        System.out.println(avg);

    }
}