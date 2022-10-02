package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Store {
	// store id
	private Long storeId;
	
	// store liên quan, trao đổi hàng hóa khi hết hàng
    private Long referenceStoreId;
    
    // doanh số ngày trước đó
    private BigDecimal stockPreviousDay;
    
    // doanh số ước tính bán ngày hôm nay
    private BigDecimal expectedSales;
    
    // được chọn để cấp phát hàng hóa từ kho
    private Boolean isSelected;
    
    public Store() {

    }

    public Store(final Long storeId, final Long referenceStoreId, final BigDecimal stockPreviousDay, final BigDecimal expectedSales, final Boolean isSelected) {
        this.storeId = storeId;
        this.referenceStoreId = referenceStoreId;
        this.stockPreviousDay = stockPreviousDay;
        this.expectedSales = expectedSales;
        this.isSelected = isSelected;
    }
    public BigDecimal getNonNullStockPreviousDay() {
    	return stockPreviousDay == null ? BigDecimal.ZERO : stockPreviousDay ;
    }
    public BigDecimal getNonNullExpectedSales() {
    	return expectedSales == null ? BigDecimal.ZERO : expectedSales ;
    }

   
    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(final Long storeId) {
        this.storeId = storeId;
    }

    public Long getReferenceStoreId() {
        return referenceStoreId;
    }

    public void setReferenceStoreId(final Long referenceStoreId) {
        this.referenceStoreId = referenceStoreId;
    }

    public BigDecimal getStockPreviousDay() {
        return stockPreviousDay;
    }

    public void setStockPreviousDay(final BigDecimal stockPreviousDay) {
        this.stockPreviousDay = stockPreviousDay;
    }

    public BigDecimal getExpectedSales() {
        return expectedSales;
    }

    public void setExpectedSales(final BigDecimal expectedSales) {
        this.expectedSales = expectedSales;
    }

    public Boolean getSelected() {
        return isSelected;
    }

    public void setSelected(final Boolean selected) {
        isSelected = selected;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Store store = (Store) o;

        return getStoreId().equals(store.getStoreId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeId);
    }

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", referenceStoreId=" + referenceStoreId + ", stockPreviousDay="
				+ stockPreviousDay + ", expectedSales=" + expectedSales + ", isSelected=" + isSelected + "]";
	}
    
}

//package bean;
//
//import java.math.BigDecimal;
//import java.util.Objects;
//
//public class Store {
//	// store id
//	private Long storeId;
//	
//	// store liên quan, trao đổi hàng hóa khi hết hàng
//    private Long referenceStoreId;
//    
//    // doanh số ngày trước đó
//    private BigDecimal stockPreviousDay;
//    
//    // doanh số ước tính bán ngày hôm nay
//    private BigDecimal expectedSales;
//    
//    // được chọn để cấp phát hàng hóa từ kho
//    private Boolean isSelected;
//    
//    public Store() {
//
//    }
//
//    public Store(final Long storeId, final Long referenceStoreId, final BigDecimal stockPreviousDay, final BigDecimal expectedSales, final Boolean isSelected) {
//        this.storeId = storeId;
//        this.referenceStoreId = referenceStoreId;
//        this.stockPreviousDay = stockPreviousDay;
//        this.expectedSales = expectedSales;
//        this.isSelected = isSelected;
//    }
//
//    public Long getStoreId() {
//        return storeId;
//    }
//
//    public void setStoreId(final Long storeId) {
//        this.storeId = storeId;
//    }
//
//    public Long getReferenceStoreId() {
//        return referenceStoreId;
//    }
//
//    public void setReferenceStoreId(final Long referenceStoreId) {
//        this.referenceStoreId = referenceStoreId;
//    }
//
//    public BigDecimal getStockPreviousDay() {
//        return stockPreviousDay;
//    }
//    public BigDecimal getNonNullStockPreviousDay() {
//    	return stockPreviousDay == null ? BigDecimal.ZERO : stockPreviousDay ;
//    }
//
//    public void setStockPreviousDay(final BigDecimal stockPreviousDay) {
//        this.stockPreviousDay = stockPreviousDay;
//    }
//
//    public BigDecimal getExpectedSales() {
//        return expectedSales;
//    }
//    public BigDecimal getNonNullExpectedSales() {
//    	return expectedSales == null ? BigDecimal.ZERO : expectedSales ;
//    }
//
//    public void setExpectedSales(final BigDecimal expectedSales) {
//        this.expectedSales = expectedSales;
//    }
//
//    public Boolean getSelected() {
//        return isSelected;
//    }
//
//    public void setSelected(final Boolean selected) {
//        isSelected = selected;
//    }
//
//    @Override
//    public boolean equals(final Object o) {
//        if (this == o) return true;
//
//        if (o == null || getClass() != o.getClass()) return false;
//
//        final Store store = (Store) o;
//
//        return getStoreId().equals(store.getStoreId());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(storeId);
//    }
//
//	@Override
//	public String toString() {
//		return "Store [storeId=" + storeId + ", referenceStoreId=" + referenceStoreId + ", stockPreviousDay="
//				+ stockPreviousDay + ", expectedSales=" + expectedSales + ", isSelected=" + isSelected + "]";
//	}
//    
//}