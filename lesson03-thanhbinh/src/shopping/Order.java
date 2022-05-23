package shopping;

import javax.sound.midi.MidiFileFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Order {
    private Customer customer;
    private ItemDetail[] itemDetails;
    private LocalDateTime dateTime;

    public Order() {
    }

    public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime dateTime) {
        this.customer = customer;
        this.itemDetails = itemDetails;
        this.dateTime = dateTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ItemDetail[] getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(ItemDetail[] itemDetails) {
        this.itemDetails = itemDetails;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public double export(){
        double totalOfMoney = 0;
        ItemDetail[] ids = getItemDetails();

        for (ItemDetail id : ids){
            Item item = id.getItem();
            int quatity = id.getQuantity();
            double idcost = item.getPrice() *quatity;

            if (item.getPrice() > 50 && LocalDate.of(2021, Month.MAY,8).isEqual(getDateTime().toLocalDate())){
                idcost *=0.9;
            }
            totalOfMoney += idcost;
        }
        return totalOfMoney;
    }
}
