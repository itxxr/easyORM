//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.16 at 10:41:59 PM CST 
//


package com.itxxr.easyorm.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="databaseTableName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EntityClassName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="field" type="{http://www.itxxr.com/easyorm}FieldConfig"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityConfig", propOrder = {
    "databaseTableName",
    "entityClassName",
    "field"
})
public class EntityConfig {

    @XmlElement(required = true)
    protected String databaseTableName;
    @XmlElement(name = "EntityClassName", required = true)
    protected String entityClassName;
    @XmlElement(required = true)
    protected FieldConfig field;

    /**
     * Gets the value of the databaseTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseTableName() {
        return databaseTableName;
    }

    /**
     * Sets the value of the databaseTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseTableName(String value) {
        this.databaseTableName = value;
    }

    /**
     * Gets the value of the entityClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityClassName() {
        return entityClassName;
    }

    /**
     * Sets the value of the entityClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityClassName(String value) {
        this.entityClassName = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link FieldConfig }
     *     
     */
    public FieldConfig getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldConfig }
     *     
     */
    public void setField(FieldConfig value) {
        this.field = value;
    }

}