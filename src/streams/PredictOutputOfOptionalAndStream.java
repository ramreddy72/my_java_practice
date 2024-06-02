package streams;

import java.util.Optional;

public class PredictOutputOfOptionalAndStream {
    
    public static void main(String[] args) throws Exception {
        Optional.of(24)
                .filter(v -> v % 2 == 0)
                .map(v -> {
                    System.out.println(v);
                    return v/2;
                })
                .filter(s -> s !=0)
                .map(s -> s/6)
                .map(s -> {
                    System.out.println(s);
                    return s;
                }).orElseThrow(() -> new Exception("Data Error"));
    }
}
