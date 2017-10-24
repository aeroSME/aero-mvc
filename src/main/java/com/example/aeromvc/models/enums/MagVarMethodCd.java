package com.example.aeromvc.models.enums;

import com.example.aeromvc.models.forms.AerNavSvc;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MagVarMethodCd {

    @Id
    @GeneratedValue
    private int Id;

    @NotNull
    private String name;

    @OneToMany
    @JoinColumn(name = "mag_var_method_cd_id")
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