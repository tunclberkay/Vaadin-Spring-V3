package com.example.application.views.personel;

import com.example.application.views.model.Personel;
import com.example.application.views.service.PersonelService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class PersonelPresenter {

    private final PersonelService personelService;
    private PersonelView view;

    public PersonelPresenter(PersonelService personelService) {
        this.personelService = personelService;
    }

    public void setView(PersonelView view) {
        this.view = view;
    }

    public void loadPersonelList() {
        List<Personel> personelList = personelService.getPersonelList();
        view.updateGrid(personelList);
    }

    public void filterPersonel(String searchText) {
        List<Personel> filteredList = personelService.getPersonelList().stream()
                .filter(person -> person.getAd().toLowerCase().contains(searchText.toLowerCase()))
                .toList();
        view.updateGrid(filteredList);
    }
    

    public void removePersonel(Personel personel) {
        personelService.removePersonel(personel);
        loadPersonelList();
    }


    public void updatePersonel(Personel updatedPersonel) {
        personelService.updatePersonel(updatedPersonel);
        loadPersonelList();
    }

    
    public void addRandomPersonel() {
        String[] names = {"Cem", "Selin", "Burak", "Ece", "Deniz", "Emre", "Selim"};
        String[] surnames = {"Koç", "Öztürk", "Şen", "Aslan", "Güneş", "Yıldırım", "Kutlu"};
        String[] categories = {"Nöbetçi", "Nöbetçi Değil",};
        String[] addresses = {
            "İstanbul, Beşiktaş", "Ankara, Çankaya", "İzmir, Karşıyaka",
            "Bursa, Nilüfer", "Antalya, Konyaaltı", "Adana, Seyhan"
        };
        String[] phones = {
            "0532 123 45 67", "0543 987 65 43", "0555 678 90 12",
            "0500 111 22 33", "0533 444 55 66", "0542 777 88 99"
        };
        Random random = new Random();
        String randomName = names[random.nextInt(names.length)];
        String randomSurname = surnames[random.nextInt(surnames.length)];
        String randomTC = String.valueOf(10000000000L + random.nextInt(900000000));
        String randomCategory = categories[random.nextInt(categories.length)];
        String randomAddress = addresses[random.nextInt(addresses.length)];
        String randomPhone = phones[random.nextInt(phones.length)];
        int randomSalary = 5000 + random.nextInt(5001);

        Personel yeniPersonel = new Personel(randomName, randomSurname, randomTC , randomCategory,randomPhone, randomAddress, randomSalary);
        personelService.addPersonel(yeniPersonel);
        loadPersonelList();
    }
}
