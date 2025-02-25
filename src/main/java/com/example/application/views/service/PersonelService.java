package com.example.application.views.service;

import com.example.application.views.model.Personel;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonelService {
    private final List<Personel> personelList = new ArrayList<>(); 

    public PersonelService() { 
        loadDummyData(); 
    }

    private void loadDummyData() {
        personelList.add(new Personel("Ahmet", "Yılmaz", "14173139586", "Nöbetçi", "0532 123 45 67", "Bursa, Nilüfer", 9000.0));
        personelList.add(new Personel("Mehmet", "Kaya", "14172536457", "Nöbetçi", "0543 987 65 43", "İstanbul, Beşiktaş", 7500.0));
        personelList.add(new Personel("Ayşe", "Demir", "18524253865", "Nöbetçi Değil", "0555 678 90 12", "Ankara, Çankaya", 10000.0));
        personelList.add(new Personel("Fatma", "Çelik", "19258459756", "Nöbetçi Değil", "0500 111 22 33", "İzmir, Karşıyaka", 6500.0));
        personelList.add(new Personel("Hasan", "Güneş", "19422558459", "Nöbetçi Değil", "0533 444 55 66", "Adana, Seyhan", 9500.0));
        personelList.add(new Personel("Zeynep", "Arslan", "12258545952", "Nöbetçi", "0542 777 88 99", "Antalya, Konyaaltı", 7000.0));
        personelList.add(new Personel("Ali", "Doğan", "19252584595", "Nöbetçi Değil", "0531 222 33 44", "Bursa, Osmangazi", 7200.0));
        personelList.add(new Personel("Elif", "Koç", "19258459524", "Nöbetçi", "0501 888 99 00", "İstanbul, Kadıköy", 6800.0));
        personelList.add(new Personel("Mustafa", "Aydın", "19258459452", "Nöbetçi Değil", "0537 555 44 33", "Eskişehir, Tepebaşı", 7700.0));
        personelList.add(new Personel("Hülya", "Şahin", "19258459452", "Nöbetçi", "0506 666 77 88", "İzmir, Bornova", 9800.0));
    }

    public List<Personel> getPersonelList() {
        return personelList; 
    }
    
    public void addPersonel(Personel yeniPersonel) {
        personelList.add(yeniPersonel); 
    }


    public void updatePersonel(Personel updatedPersonel) {
        for (int i = 0; i < personelList.size(); i++) {
            if (personelList.get(i).getTC().equals(updatedPersonel.getTC())) {
                personelList.set(i, updatedPersonel);
                break;
            }
        }
    }


    public void removePersonel(Personel personel) {
        personelList.removeIf(p -> p.getTC().equals(personel.getTC()));
    }
}
