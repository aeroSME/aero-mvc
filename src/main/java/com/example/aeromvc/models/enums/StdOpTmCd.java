package com.example.aeromvc.models.enums;

import com.example.aeromvc.models.forms.AerNavSvc;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class StdOpTmCd {

    @Id
    @GeneratedValue
    private int Id;

    @NotNull
    private String name;

    @OneToMany
    @JoinColumn(name = "std_op_tm_cd_id")
    private List<AerNavSvc> navaids = new ArrayList<>();

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AerNavSvc> getNavaids() { return navaids;
    }
}