package com.spring.model;

import java.math.BigDecimal;
import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="product")
public class Product {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		private String name;
		private String  description;
		private BigDecimal price;
		@CreationTimestamp
		private Date createAt;
		@CreationTimestamp
		private Date updateAt;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public BigDecimal getPrice() {
			return price;
		}
		public void setPrice(BigDecimal price) {
			this.price = price;
		}
		public Date getCreateAt() {
			return createAt;
		}
		public void setCreateAt(Date createAt) {
			this.createAt = createAt;
		}
		public Date getUpdateAt() {
			return updateAt;
		}
		public void setUpdateAt(Date updateAt) {
			this.updateAt = updateAt;
		}
		
		
}
