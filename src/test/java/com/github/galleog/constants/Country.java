package com.github.galleog.constants;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Persistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity for countries.
 *
 * @author Oleg Galkin
 */
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Country implements Persistable<String> {
    @Id
    @Column(columnDefinition = "char(2)")
    private String id;

    @Setter
    private String name;

    /**
     * Creates a country by its code.
     *
     * @param code the country code
     */
    public Country(String code) {
        this.id = code;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
