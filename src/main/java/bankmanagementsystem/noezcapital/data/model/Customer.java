package bankmanagementsystem.noezcapital.data.model;


import java.util.Date;
import java.util.UUID;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String firstName;

    private String lastName;

    private String middleName;

    private Long customerNumber;

    private String status;

    private SocialMedia socialMediaAddress;

    @ManyToOne(cascade=CascadeType.ALL)
    private Address customerAddress;

    @OneToOne(cascade=CascadeType.ALL)
    private Contact contactDetails;

    @Temporal(TemporalType.TIME)
    private Date createDateTime;

    @Temporal(TemporalType.TIME)
    private Date updateDateTime;


}
