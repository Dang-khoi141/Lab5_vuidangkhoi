package vn.edu.iuh.fit.vudangkhoi_lab5;

import com.neovisionaries.i18n.CountryCode;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.vudangkhoi_lab5.backend.models.Address;
import vn.edu.iuh.fit.vudangkhoi_lab5.backend.models.Candidate;
import vn.edu.iuh.fit.vudangkhoi_lab5.backend.models.Company;
import vn.edu.iuh.fit.vudangkhoi_lab5.backend.repositories.AddressRepository;
import vn.edu.iuh.fit.vudangkhoi_lab5.backend.repositories.CandidateRepository;
import vn.edu.iuh.fit.vudangkhoi_lab5.backend.repositories.CompanyRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class VudangkhoiLab5Application {

    public static void main(String[] args) {
        SpringApplication.run(VudangkhoiLab5Application.class, args);
    }
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private CandidateRepository candidateRepository;

    @Bean
    @Transactional
    CommandLineRunner initData(CompanyRepository companyRepository) {
        return args -> {
            Random rnd = new Random();

            String[] diaChi = {"Nguyen Trai", "Le Loi", "Tran Hung Dao", "Nguyen Hue", "Le Lai"};
            String[] city = {"HCM", "Ninh Thuan", "Nha Trang", "Can Tho", "Vung Tau"};
            String[] number = {"09", "08", "07", "05", "03"};
            String[] fullName = {"Tran Anh Tien", "Vu Dang Khoi", "Ngo Quang Truong", "Dang Minh Phuong", "Nguyen Dinh Duong","Tran Trung Hieu"};
//            for (int i = 1; i <= 1000; i++) {
//              Address address = new Address();
//                address.setStreet(diaChi[rnd.nextInt(5)]);
//                address.setCity(city[rnd.nextInt(5)]);
//                address.setCountry(CountryCode.VN);
//                address.setNumber(number[rnd.nextInt(5)] + rnd.nextLong(11111111L, 99999999L));
//                address.setZipcode(rnd.nextInt(70000, 80000)+"");
//                addressRepository.save(address);
//                Candidate candidate = new Candidate();
//                candidate.setFullName(fullName[rnd.nextInt(5)]);
//                candidate.setDob(LocalDate.of(rnd.nextInt(1970, 2000), rnd.nextInt(1, 12), rnd.nextInt(1, 28)));
//                candidate.setEmail("candidate" + i + "@gmail.com");
//                candidate.setPhone(number[rnd.nextInt(5)] + rnd.nextLong(11111111L, 99999999L));
//                candidate.setAddress(address);
//                candidateRepository.save(candidate);
                // 2. Tạo và lưu Company
//
//                List<Address> addresses = Arrays.asList(
//                    new Address("1600", "Amphitheatre Pkwy", "Mountain View", "94043", CountryCode.US),
//                    new Address("1", "Microsoft Way", "Redmond", "98052", CountryCode.US),
//                    new Address("1", "Infinite Loop", "Cupertino", "95014", CountryCode.US),
//                    new Address("456", "Broadway St", "New York", "10001", CountryCode.US),
//                    new Address("789", "Market St", "San Francisco", "94103", CountryCode.US)
//                    // Add 15 more unique addresses
//                );
//                addressRepository.saveAll(addresses);
//                List<Company> companies = Arrays.asList(
//                        new Company("Google", "contact@google.com", "123456789", "0123456789", "https://google.com", addresses.get(0), null),
//                        new Company("Microsoft", "contact@microsoft.com", "987654321", "0987654321", "https://microsoft.com", addresses.get(1), null),
//                        new Company("Apple", "contact@apple.com", "555666777", "0123456789", "https://apple.com", addresses.get(2), null)
//                        // Thêm 17 công ty khác tại đây
//                );
//                companyRepository.saveAll(companies);


//            }


        };
    }

}
