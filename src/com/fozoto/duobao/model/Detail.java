package com.fozoto.duobao.model;

import org.springframework.context.annotation.Scope;

import javax.persistence.*;

/**
 * 商品的详细描述
 * Created by qingyan on 16-7-27.
 */
@Entity(name = "Detail")
@Scope("prototype")
public class Detail {

    private int id;             // 主键
    private String image;       // 图片地址
    // 外键（多对一，外键放在多的一方）
    private Goods goods;        // 图片所属商品

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    @ManyToOne(targetEntity = Goods.class, cascade = CascadeType.ALL, optional = false)
    public Goods getGoods() {
        return goods;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", image='" + image + '\'' +
                '}';
    }
}
