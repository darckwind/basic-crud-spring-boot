package model;

import javax.persistence.Table;
import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "paciente")
public class Paciente {

    //el rut debe ser usado como PK en formato unico dado que como se indica en el istructivo
    @Id
    @NotBlank(message = "Name is mandatory")
    private String pac_run;

    //el campo de tipo de docuemtno es necesario dado que este puede cambiar si la persona
    //ingresada no es chilena u cuenta con otro tipo de identificaion.
    @NotBlank(message = "Name is mandatory")
    private String pac_id_tip;

    @NotBlank(message = "Name is mandatory")
    private Boolean pac_est;

    @NotBlank(message = "Name is mandatory")
    private String pac_nombre;

    //tanto el apellido paterno como el materno deben estar separados, como se muestra en la ui del sistema.
    @NotBlank(message = "Name is mandatory")
    private String pac_apell_pat;

    @NotBlank(message = "Name is mandatory")
    private String pac_apell_mat;

    //en primera instancia dicho campo puede ser remplazado por el uso de un id,
    //si se decide crear una tabla par listar los sexos disponibles en el momento.
    @NotBlank(message = "Name is mandatory")
    private String pac_sexo;

    @NotBlank(message = "Name is mandatory")
    private Date pac_fec_nac;

    //este campo es opcional devido a que la persona no necesariamente estara muerto al momento del incgreso.
    //se mantinee el sufico anterior con la finalidad de mantener una continuidad dada la relacion entre ambos campos.
    private Date pac_fec_def;

    //valor de nacionalidad asociable a un id, sis e agrega una tabla de nacionalidades de lo contrario dejar como un String.
    @NotBlank(message = "Name is mandatory")
    private String pac_nacion;

    //valor de pueblo originario asociable a un id, si se agrega una tabla de nacionalidades de lo contrario dejar como un String.
    @NotBlank(message = "Name is mandatory")
    private String pac_pueb_org;

    //campo que puede ser ser usado con un id si se usa tabla que almacene los valores pertinentes de manera independiente.
    @NotBlank(message = "Name is mandatory")
    private String pac_tip_reci;

    @NotBlank(message = "Name is mandatory")
    private String pac_dir;

    //se mantinee el sufico anterior con la finalidad de mantener una continuidad dada la relacion entre ambos campos(dirrecion y numero).
    @NotBlank(message = "Name is mandatory")
    private Integer pac_dir_num;

    //se mantinee el sufico anterior con la finalidad de mantener una continuidad dada la relacion entre ambos campos(dirrecion y departamento),
    // en este caso haciendo referencia al departamento o letra de la vivienda.
    @NotBlank(message = "Name is mandatory")
    private String pac_dir_dep;

    @NotBlank(message = "Name is mandatory")
    private String pac_pob;

    @NotBlank(message = "Name is mandatory")
    private String pac_reg_res;

    @NotBlank(message = "Name is mandatory")
    private String pac_com_res;

    //campo opcional devido a que no todos poseen un telefoino de red fija.
    private String pac_tel_fijo;

    @NotBlank(message = "Name is mandatory")
    private String pac_tel_cel;


    //creacion del constructor de la clase

    public Paciente() {
    }

    public Paciente(@NotBlank(message = "Name is mandatory") String pac_run, @NotBlank(message = "Name is mandatory") String pac_id_tip, @NotBlank(message = "Name is mandatory") Boolean pac_est, @NotBlank(message = "Name is mandatory") String pac_nombre, @NotBlank(message = "Name is mandatory") String pac_apell_pat, @NotBlank(message = "Name is mandatory") String pac_apell_mat, @NotBlank(message = "Name is mandatory") String pac_sexo, @NotBlank(message = "Name is mandatory") Date pac_fec_nac, Date pac_fec_def, @NotBlank(message = "Name is mandatory") String pac_nacion, @NotBlank(message = "Name is mandatory") String pac_pueb_org, @NotBlank(message = "Name is mandatory") String pac_tip_reci, @NotBlank(message = "Name is mandatory") String pac_dir, @NotBlank(message = "Name is mandatory") Integer pac_dir_num, @NotBlank(message = "Name is mandatory") String pac_dir_dep, @NotBlank(message = "Name is mandatory") String pac_pob, @NotBlank(message = "Name is mandatory") String pac_reg_res, @NotBlank(message = "Name is mandatory") String pac_com_res, String pac_tel_fijo, @NotBlank(message = "Name is mandatory") String pac_tel_cel) {
        super();
        this.pac_run = pac_run;
        this.pac_id_tip = pac_id_tip;
        this.pac_est = pac_est;
        this.pac_nombre = pac_nombre;
        this.pac_apell_pat = pac_apell_pat;
        this.pac_apell_mat = pac_apell_mat;
        this.pac_sexo = pac_sexo;
        this.pac_fec_nac = pac_fec_nac;
        this.pac_fec_def = pac_fec_def;
        this.pac_nacion = pac_nacion;
        this.pac_pueb_org = pac_pueb_org;
        this.pac_tip_reci = pac_tip_reci;
        this.pac_dir = pac_dir;
        this.pac_dir_num = pac_dir_num;
        this.pac_dir_dep = pac_dir_dep;
        this.pac_pob = pac_pob;
        this.pac_reg_res = pac_reg_res;
        this.pac_com_res = pac_com_res;
        this.pac_tel_fijo = pac_tel_fijo;
        this.pac_tel_cel = pac_tel_cel;
    }


    //get an set
    public String getPac_run() {
        return pac_run;
    }

    public void setPac_run(String pac_run) {
        this.pac_run = pac_run;
    }

    public String getPac_id_tip() {
        return pac_id_tip;
    }

    public void setPac_id_tip(String pac_id_tip) {
        this.pac_id_tip = pac_id_tip;
    }

    public Boolean getPac_est() {
        return pac_est;
    }

    public void setPac_est(Boolean pac_est) {
        this.pac_est = pac_est;
    }

    public String getPac_nombre() {
        return pac_nombre;
    }

    public void setPac_nombre(String pac_nombre) {
        this.pac_nombre = pac_nombre;
    }

    public String getPac_apell_pat() {
        return pac_apell_pat;
    }

    public void setPac_apell_pat(String pac_apell_pat) {
        this.pac_apell_pat = pac_apell_pat;
    }

    public String getPac_apell_mat() {
        return pac_apell_mat;
    }

    public void setPac_apell_mat(String pac_apell_mat) {
        this.pac_apell_mat = pac_apell_mat;
    }

    public String getPac_sexo() {
        return pac_sexo;
    }

    public void setPac_sexo(String pac_sexo) {
        this.pac_sexo = pac_sexo;
    }

    public Date getPac_fec_nac() {
        return pac_fec_nac;
    }

    public void setPac_fec_nac(Date pac_fec_nac) {
        this.pac_fec_nac = pac_fec_nac;
    }

    public Date getPac_fec_def() {
        return pac_fec_def;
    }

    public void setPac_fec_def(Date pac_fec_def) {
        this.pac_fec_def = pac_fec_def;
    }

    public String getPac_nacion() {
        return pac_nacion;
    }

    public void setPac_nacion(String pac_nacion) {
        this.pac_nacion = pac_nacion;
    }

    public String getPac_pueb_org() {
        return pac_pueb_org;
    }

    public void setPac_pueb_org(String pac_pueb_org) {
        this.pac_pueb_org = pac_pueb_org;
    }

    public String getPac_tip_reci() {
        return pac_tip_reci;
    }

    public void setPac_tip_reci(String pac_tip_reci) {
        this.pac_tip_reci = pac_tip_reci;
    }

    public String getPac_dir() {
        return pac_dir;
    }

    public void setPac_dir(String pac_dir) {
        this.pac_dir = pac_dir;
    }

    public Integer getPac_dir_num() {
        return pac_dir_num;
    }

    public void setPac_dir_num(Integer pac_dir_num) {
        this.pac_dir_num = pac_dir_num;
    }

    public String getPac_dir_dep() {
        return pac_dir_dep;
    }

    public void setPac_dir_dep(String pac_dir_dep) {
        this.pac_dir_dep = pac_dir_dep;
    }

    public String getPac_pob() {
        return pac_pob;
    }

    public void setPac_pob(String pac_pob) {
        this.pac_pob = pac_pob;
    }

    public String getPac_reg_res() {
        return pac_reg_res;
    }

    public void setPac_reg_res(String pac_reg_res) {
        this.pac_reg_res = pac_reg_res;
    }

    public String getPac_com_res() {
        return pac_com_res;
    }

    public void setPac_com_res(String pac_com_res) {
        this.pac_com_res = pac_com_res;
    }

    public String getPac_tel_fijo() {
        return pac_tel_fijo;
    }

    public void setPac_tel_fijo(String pac_tel_fijo) {
        this.pac_tel_fijo = pac_tel_fijo;
    }

    public String getPac_tel_cel() {
        return pac_tel_cel;
    }

    public void setPac_tel_cel(String pac_tel_cel) {
        this.pac_tel_cel = pac_tel_cel;
    }
}
