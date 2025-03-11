package hafta2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAPIFormating {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;

        System.out.println(today.format(dateTimeFormatter));

        System.out.println(today.format(dateTimeFormatter.ofPattern("dd/MM/yyyy"))); //küçük m ile yapamazsın o dakika

        String stringDate = "25/01/2026";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate = LocalDate.parse(stringDate, formatter);

        System.out.println("İleri tarihi: " + localDate);

        System.out.println(LocalDate.parse("2025-03-23")); // ya kendi formatını vericen yada yazılım formatına uyarak yapıcaksın

       // System.out.println(LocalDate.parse("23-05-2027")); // format değiştiği için hata veriyor

         LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        System.out.println(now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));

        System.out.println(now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:")));

        String stringDateTime = "25-02-2026 16:05:55";

        System.out.println(LocalDateTime.parse(stringDateTime, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));

        LocalDateTime localDateTimeAustralia = ZonedDateTime.now(ZoneId.of("Australia/Sydney")).toLocalDateTime();

        System.out.println("AUSTRALİA: " + localDateTimeAustralia);






















    }
}
