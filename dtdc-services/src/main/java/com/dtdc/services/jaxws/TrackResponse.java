
package com.dtdc.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "trackResponse", namespace = "http://www.dtdc.com/tracking/services")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trackResponse", namespace = "http://www.dtdc.com/tracking/services")
public class TrackResponse {

    @XmlElement(name = "parcel-status", namespace = "http://www.dtdc.com/tracking/types")
    private String parcelStatus;

    /**
     * 
     * @return
     *     returns String
     */
    public String getParcelStatus() {
        return this.parcelStatus;
    }

    /**
     * 
     * @param parcelStatus
     *     the value for the parcelStatus property
     */
    public void setParcelStatus(String parcelStatus) {
        this.parcelStatus = parcelStatus;
    }

}
