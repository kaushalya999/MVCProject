/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;
import edu.ijse.mvc.db.DBConnection;
import java.sql.Connection;
/**
 *
 * @author User
 */
public class ItemModel {
    private final Connection connection;
    
    public ItemModel()throws ClassNotFoundException, {
        this.connection = DBConnection.getInstance().getConnection();
    }
    
    public String saveItem(ItemDto itemDto){
        
    }
}
