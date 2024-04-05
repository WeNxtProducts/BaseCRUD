package com.wenxt.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="LT_POL_OCC_COVER")
public class LT_POL_OCC_COVER {
	
		@Id
	    private long pocvr_tran_id;
	    private long pocvr_pol_tran_id;
	    private String pocvr_occ_catg;
	    private String pocvr_cover_code;
	    private String pocvr_del_flag;
	    private Date pocvr_ins_dt;
	    private String pocvr_ins_id;
	    private Date pocvr_mod_dt;
	    private String pocvr_mod_id;
	    private long pocvr_rate_per;
	    private double pocvr_rate;
	    private double pocvr_fc_limit;
	    private double pocvr_lc_limit;
	    private String pocvr_rec_type;
	    private String pocvr_occ_code;
	    private double pocvr_sal_lc_fm;
	    private double pocvr_sal_lc_to;
	    private int pocvr_sa_months;
	    private String pocvr_default_yn;

	   
	    public LT_POL_OCC_COVER() {}

	    public long getPocvr_tran_id() {
	        return pocvr_tran_id;
	    }

	    public void setPocvr_tran_id(long pocvr_tran_id) {
	        this.pocvr_tran_id = pocvr_tran_id;
	    }

	    public long getPocvr_pol_tran_id() {
	        return pocvr_pol_tran_id;
	    }

	    public void setPocvr_pol_tran_id(long pocvr_pol_tran_id) {
	        this.pocvr_pol_tran_id = pocvr_pol_tran_id;
	    }

	    public String getPocvr_occ_catg() {
	        return pocvr_occ_catg;
	    }

	    public void setPocvr_occ_catg(String pocvr_occ_catg) {
	        this.pocvr_occ_catg = pocvr_occ_catg;
	    }

	    public String getPocvr_cover_code() {
	        return pocvr_cover_code;
	    }

	    public void setPocvr_cover_code(String pocvr_cover_code) {
	        this.pocvr_cover_code = pocvr_cover_code;
	    }

	    public String getPocvr_del_flag() {
	        return pocvr_del_flag;
	    }

	    public void setPocvr_del_flag(String pocvr_del_flag) {
	        this.pocvr_del_flag = pocvr_del_flag;
	    }

	    public Date getPocvr_ins_dt() {
	        return pocvr_ins_dt;
	    }

	    public void setPocvr_ins_dt(Date pocvr_ins_dt) {
	        this.pocvr_ins_dt = pocvr_ins_dt;
	    }

	    public String getPocvr_ins_id() {
	        return pocvr_ins_id;
	    }

	    public void setPocvr_ins_id(String pocvr_ins_id) {
	        this.pocvr_ins_id = pocvr_ins_id;
	    }

	    public Date getPocvr_mod_dt() {
	        return pocvr_mod_dt;
	    }

	    public void setPocvr_mod_dt(Date pocvr_mod_dt) {
	        this.pocvr_mod_dt = pocvr_mod_dt;
	    }

	    public String getPocvr_mod_id() {
	        return pocvr_mod_id;
	    }

	    public void setPocvr_mod_id(String pocvr_mod_id) {
	        this.pocvr_mod_id = pocvr_mod_id;
	    }

	    public long getPocvr_rate_per() {
	        return pocvr_rate_per;
	    }

	    public void setPocvr_rate_per(long pocvr_rate_per) {
	        this.pocvr_rate_per = pocvr_rate_per;
	    }

	    public double getPocvr_rate() {
	        return pocvr_rate;
	    }

	    public void setPocvr_rate(double pocvr_rate) {
	        this.pocvr_rate = pocvr_rate;
	    }

	    public double getPocvr_fc_limit() {
	        return pocvr_fc_limit;
	    }

	    public void setPocvr_fc_limit(double pocvr_fc_limit) {
	        this.pocvr_fc_limit = pocvr_fc_limit;
	    }

	    public double getPocvr_lc_limit() {
	        return pocvr_lc_limit;
	    }

	    public void setPocvr_lc_limit(double pocvr_lc_limit) {
	        this.pocvr_lc_limit = pocvr_lc_limit;
	    }

	    public String getPocvr_rec_type() {
	        return pocvr_rec_type;
	    }

	    public void setPocvr_rec_type(String pocvr_rec_type) {
	        this.pocvr_rec_type = pocvr_rec_type;
	    }

	    public String getPocvr_occ_code() {
	        return pocvr_occ_code;
	    }

	    public void setPocvr_occ_code(String pocvr_occ_code) {
	        this.pocvr_occ_code = pocvr_occ_code;
	    }

	    public double getPocvr_sal_lc_fm() {
	        return pocvr_sal_lc_fm;
	    }

	    public void setPocvr_sal_lc_fm(double pocvr_sal_lc_fm) {
	        this.pocvr_sal_lc_fm = pocvr_sal_lc_fm;
	    }

	    public double getPocvr_sal_lc_to() {
	        return pocvr_sal_lc_to;
	    }

	    public void setPocvr_sal_lc_to(double pocvr_sal_lc_to) {
	        this.pocvr_sal_lc_to = pocvr_sal_lc_to;
	    }

	    public int getPocvr_sa_months() {
	        return pocvr_sa_months;
	    }

	    public void setPocvr_sa_months(int pocvr_sa_months) {
	        this.pocvr_sa_months = pocvr_sa_months;
	    }

	    public String getPocvr_default_yn() {
	        return pocvr_default_yn;
	    }

	    public void setPocvr_default_yn(String pocvr_default_yn) {
	        this.pocvr_default_yn = pocvr_default_yn;
	    }
	}



