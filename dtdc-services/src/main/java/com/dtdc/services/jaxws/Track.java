
package com.dtdc.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "track", namespace = "http://www.dtdc.com/tracking/services")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "track", namespace = "http://www.dtdc.com/tracking/services", propOrder = {
    "arwNo",
    "mobileNo"
})
public class Track {

    @XmlElement(name = "arw-no", namespace = "http://www.dtdc.com/tracking/types")
    private int arwNo;
    @XmlElement(name = "mobile-no", namespace = "http://www.dtdc.com/tracking/types")
    private int mobileNo;

    /**
     * 
     * @return
     *     returns int
     */
    public int getArwNo() {
        return this.arwNo;
    }

    /**
     * 
     * @param arwNo
     *     the value for the arwNo property
     */
    public void setArwNo(int arwNo) {
        this.arwNo = arwNo;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getMobileNo() {
        return this.mobileNo;
    }

    /**
     * 
     * @param mobileNo
     *     the value for the mobileNo property
     */
    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

}
