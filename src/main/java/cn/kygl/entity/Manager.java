package cn.kygl.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "manager")
@Data
@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    @Id
    @Column(name = "mngr_id")
    private Integer mngrId;
    @Column(name = "mngr_name")
    private String mngrName;
    @Column(name = "mngr_sex")
    private String mngrSex;
    @Column(name = "mngr_identity")
    private String mngrIdentity;
    @Column(name = "pho_num")
    private String phoNum;
}