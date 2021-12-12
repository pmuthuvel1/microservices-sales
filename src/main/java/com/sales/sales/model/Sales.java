package com.sales.sales.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "sales")
@NamedQueries({
    @NamedQuery(name = "Sales.findAll", query = "SELECT s FROM Sales s"),
    @NamedQuery(name = "Sales.findById", query = "SELECT s FROM Sales s WHERE s.id = :id"),
    @NamedQuery(name = "Sales.findBySaleItem", query = "SELECT s FROM Sales s WHERE s.saleItem = :saleItem"),
    @NamedQuery(name = "Sales.findBySaleRemarks", query = "SELECT s FROM Sales s WHERE s.saleRemarks = :saleRemarks"),
    @NamedQuery(name = "Sales.findByCustomerId", query = "SELECT s FROM Sales s WHERE s.customerId = :customerId"),
    @NamedQuery(name = "Sales.findByPayId", query = "SELECT s FROM Sales s WHERE s.payId = :payId"),
    @NamedQuery(name = "Sales.findByCreatedUserId", query = "SELECT s FROM Sales s WHERE s.createdUserId = :createdUserId"),
    @NamedQuery(name = "Sales.findByCreatedDate", query = "SELECT s FROM Sales s WHERE s.createdDate = :createdDate"),
    @NamedQuery(name = "Sales.findByModifiedUserId", query = "SELECT s FROM Sales s WHERE s.modifiedUserId = :modifiedUserId"),
    @NamedQuery(name = "Sales.findByModifiedDate", query = "SELECT s FROM Sales s WHERE s.modifiedDate = :modifiedDate")})
public class Sales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "sale_item")
    private int saleItem;
    @Column(name = "sale_remarks")
    private String saleRemarks;
    @Basic(optional = false)
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @Column(name = "pay_id")
    private int payId;
    @Column(name = "created_user_id")
    private String createdUserId;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "modified_user_id")
    private String modifiedUserId;
    @Column(name = "modified_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Sales() {
    }

    public Sales(Integer id) {
        this.id = id;
    }

    public Sales(Integer id, int saleItem, int customerId, int payId) {
        this.id = id;
        this.saleItem = saleItem;
        this.customerId = customerId;
        this.payId = payId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSaleItem() {
        return saleItem;
    }

    public void setSaleItem(int saleItem) {
        this.saleItem = saleItem;
    }

    public String getSaleRemarks() {
        return saleRemarks;
    }

    public void setSaleRemarks(String saleRemarks) {
        this.saleRemarks = saleRemarks;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getPayId() {
        return payId;
    }

    public void setPayId(int payId) {
        this.payId = payId;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sales)) {
            return false;
        }
        Sales other = (Sales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crm.customer.model.Sales[ id=" + id + " ]";
    }
    
}
