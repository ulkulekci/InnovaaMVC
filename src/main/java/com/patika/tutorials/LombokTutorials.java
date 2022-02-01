package com.patika.tutorials;

import lombok.*;

import java.util.Objects;

@Data //gettersetter+hashcode+toString+
@NoArgsConstructor //Parametresiz constructor
@AllArgsConstructor //Parametreli constructor
@Builder
public class LombokTutorials {

    // @Getter @Setter
    private String adi;
    private String soyadi;
    private String numarasi;

    @Override
    public String toString() {
        return "LombokTutorials{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", numarasi='" + numarasi + '\'' +
                '}';
    }


    public static void main(String[] args) {
        LombokTutorials tutorials=
                LombokTutorials
                        .builder()
                        .adi("ülkü")
                        .soyadi("KÜLEKCİ")
                        .numarasi("1515asSDFXC")
                        .build();
        System.out.println(tutorials);
    }

}