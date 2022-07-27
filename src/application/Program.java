package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) throws SQLException {
//        Department obj = new Department(1,"Books");
//        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0,obj);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        List<Seller> list = sellerDao.findByDepartment(new Department(2,null));
        for (Seller obj : list) System.out.println(obj);

        System.out.println("\n=== TEST 3: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list) System.out.println(obj);

    }
}
