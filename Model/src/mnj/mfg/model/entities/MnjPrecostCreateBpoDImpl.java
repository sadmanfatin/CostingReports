package mnj.mfg.model.entities;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed May 04 12:14:15 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjPrecostCreateBpoDImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DetId {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getDetId();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setDetId((Number)value);
            }
        }
        ,
        LineId {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getLineId();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setLineId((Number)value);
            }
        }
        ,
        FabricDesc {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getFabricDesc();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setFabricDesc((String)value);
            }
        }
        ,
        WashName {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getWashName();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setWashName((String)value);
            }
        }
        ,
        Color {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getColor();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setColor((String)value);
            }
        }
        ,
        Fob {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getFob();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setFob((Number)value);
            }
        }
        ,
        BpoNo {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getBpoNo();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setBpoNo((String)value);
            }
        }
        ,
        Classfic {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getClassfic();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setClassfic((String)value);
            }
        }
        ,
        BpoQty {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getBpoQty();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setBpoQty((Number)value);
            }
        }
        ,
        Balance {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getBalance();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setBalance((Number)value);
            }
        }
        ,
        PoType {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getPoType();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setPoType((String)value);
            }
        }
        ,
        Incoterms {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getIncoterms();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setIncoterms((String)value);
            }
        }
        ,
        Status {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getStatus();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setStatus((String)value);
            }
        }
        ,
        FlagD {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getFlagD();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setFlagD((String)value);
            }
        }
        ,
        HeaderId {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getHeaderId();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ,
        Country {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getCountry();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setCountry((String)value);
            }
        }
        ,
        DeliveryEndDate {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getDeliveryEndDate();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setDeliveryEndDate((Date)value);
            }
        }
        ,
        DeliveryStartDate {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getDeliveryStartDate();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setDeliveryStartDate((Date)value);
            }
        }
        ,
        ShipMode {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getShipMode();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setShipMode((String)value);
            }
        }
        ,
        ReplaceBpo {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getReplaceBpo();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setReplaceBpo((String)value);
            }
        }
        ,
        ChildStyleNo {
            public Object get(MnjPrecostCreateBpoDImpl obj) {
                return obj.getChildStyleNo();
            }

            public void put(MnjPrecostCreateBpoDImpl obj, Object value) {
                obj.setChildStyleNo((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjPrecostCreateBpoDImpl object);

        public abstract void put(MnjPrecostCreateBpoDImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int DETID = AttributesEnum.DetId.index();
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int FABRICDESC = AttributesEnum.FabricDesc.index();
    public static final int WASHNAME = AttributesEnum.WashName.index();
    public static final int COLOR = AttributesEnum.Color.index();
    public static final int FOB = AttributesEnum.Fob.index();
    public static final int BPONO = AttributesEnum.BpoNo.index();
    public static final int CLASSFIC = AttributesEnum.Classfic.index();
    public static final int BPOQTY = AttributesEnum.BpoQty.index();
    public static final int BALANCE = AttributesEnum.Balance.index();
    public static final int POTYPE = AttributesEnum.PoType.index();
    public static final int INCOTERMS = AttributesEnum.Incoterms.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int FLAGD = AttributesEnum.FlagD.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int COUNTRY = AttributesEnum.Country.index();
    public static final int DELIVERYENDDATE = AttributesEnum.DeliveryEndDate.index();
    public static final int DELIVERYSTARTDATE = AttributesEnum.DeliveryStartDate.index();
    public static final int SHIPMODE = AttributesEnum.ShipMode.index();
    public static final int REPLACEBPO = AttributesEnum.ReplaceBpo.index();
    public static final int CHILDSTYLENO = AttributesEnum.ChildStyleNo.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjPrecostCreateBpoDImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.mfg.model.entities.MnjPrecostCreateBpoD");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for DetId, using the alias name DetId.
     * @return the DetId
     */
    public Number getDetId() {
        return (Number)getAttributeInternal(DETID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DetId.
     * @param value value to set the DetId
     */
    public void setDetId(Number value) {
        setAttributeInternal(DETID, value);
    }

    /**
     * Gets the attribute value for LineId, using the alias name LineId.
     * @return the LineId
     */
    public Number getLineId() {
        return (Number)getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineId.
     * @param value value to set the LineId
     */
    public void setLineId(Number value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for FabricDesc, using the alias name FabricDesc.
     * @return the FabricDesc
     */
    public String getFabricDesc() {
        return (String)getAttributeInternal(FABRICDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for FabricDesc.
     * @param value value to set the FabricDesc
     */
    public void setFabricDesc(String value) {
        setAttributeInternal(FABRICDESC, value);
    }

    /**
     * Gets the attribute value for WashName, using the alias name WashName.
     * @return the WashName
     */
    public String getWashName() {
        return (String)getAttributeInternal(WASHNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for WashName.
     * @param value value to set the WashName
     */
    public void setWashName(String value) {
        setAttributeInternal(WASHNAME, value);
    }

    /**
     * Gets the attribute value for Color, using the alias name Color.
     * @return the Color
     */
    public String getColor() {
        return (String)getAttributeInternal(COLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Color.
     * @param value value to set the Color
     */
    public void setColor(String value) {
        setAttributeInternal(COLOR, value);
    }

    /**
     * Gets the attribute value for Fob, using the alias name Fob.
     * @return the Fob
     */
    public Number getFob() {
        return (Number)getAttributeInternal(FOB);
    }

    /**
     * Sets <code>value</code> as the attribute value for Fob.
     * @param value value to set the Fob
     */
    public void setFob(Number value) {
        setAttributeInternal(FOB, value);
    }

    /**
     * Gets the attribute value for BpoNo, using the alias name BpoNo.
     * @return the BpoNo
     */
    public String getBpoNo() {
        return (String)getAttributeInternal(BPONO);
    }

    /**
     * Sets <code>value</code> as the attribute value for BpoNo.
     * @param value value to set the BpoNo
     */
    public void setBpoNo(String value) {
        setAttributeInternal(BPONO, value);
    }

    /**
     * Gets the attribute value for Classfic, using the alias name Classfic.
     * @return the Classfic
     */
    public String getClassfic() {
        return (String)getAttributeInternal(CLASSFIC);
    }

    /**
     * Sets <code>value</code> as the attribute value for Classfic.
     * @param value value to set the Classfic
     */
    public void setClassfic(String value) {
        setAttributeInternal(CLASSFIC, value);
    }

    /**
     * Gets the attribute value for BpoQty, using the alias name BpoQty.
     * @return the BpoQty
     */
    public Number getBpoQty() {
        return (Number)getAttributeInternal(BPOQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BpoQty.
     * @param value value to set the BpoQty
     */
    public void setBpoQty(Number value) {
        setAttributeInternal(BPOQTY, value);
    }

    /**
     * Gets the attribute value for Balance, using the alias name Balance.
     * @return the Balance
     */
    public Number getBalance() {
        return (Number)getAttributeInternal(BALANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Balance.
     * @param value value to set the Balance
     */
    public void setBalance(Number value) {
        setAttributeInternal(BALANCE, value);
    }

    /**
     * Gets the attribute value for PoType, using the alias name PoType.
     * @return the PoType
     */
    public String getPoType() {
        return (String)getAttributeInternal(POTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoType.
     * @param value value to set the PoType
     */
    public void setPoType(String value) {
        setAttributeInternal(POTYPE, value);
    }

    /**
     * Gets the attribute value for Incoterms, using the alias name Incoterms.
     * @return the Incoterms
     */
    public String getIncoterms() {
        return (String)getAttributeInternal(INCOTERMS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Incoterms.
     * @param value value to set the Incoterms
     */
    public void setIncoterms(String value) {
        setAttributeInternal(INCOTERMS, value);
    }

    /**
     * Gets the attribute value for Status, using the alias name Status.
     * @return the Status
     */
    public String getStatus() {
        return (String)getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Status.
     * @param value value to set the Status
     */
    public void setStatus(String value) {
        setAttributeInternal(STATUS, value);
    }


    /**
     * Gets the attribute value for FlagD, using the alias name FlagD.
     * @return the FlagD
     */
    public String getFlagD() {
        return (String)getAttributeInternal(FLAGD);
    }

    /**
     * Sets <code>value</code> as the attribute value for FlagD.
     * @param value value to set the FlagD
     */
    public void setFlagD(String value) {
        setAttributeInternal(FLAGD, value);
    }

    /**
     * Gets the attribute value for HeaderId, using the alias name HeaderId.
     * @return the HeaderId
     */
    public Number getHeaderId() {
        return (Number)getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for HeaderId.
     * @param value value to set the HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for Country, using the alias name Country.
     * @return the Country
     */
    public String getCountry() {
        return (String)getAttributeInternal(COUNTRY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Country.
     * @param value value to set the Country
     */
    public void setCountry(String value) {
        setAttributeInternal(COUNTRY, value);
    }

    /**
     * Gets the attribute value for DeliveryEndDate, using the alias name DeliveryEndDate.
     * @return the DeliveryEndDate
     */
    public Date getDeliveryEndDate() {
        return (Date)getAttributeInternal(DELIVERYENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DeliveryEndDate.
     * @param value value to set the DeliveryEndDate
     */
    public void setDeliveryEndDate(Date value) {
        setAttributeInternal(DELIVERYENDDATE, value);
    }

    /**
     * Gets the attribute value for DeliveryStartDate, using the alias name DeliveryStartDate.
     * @return the DeliveryStartDate
     */
    public Date getDeliveryStartDate() {
        return (Date)getAttributeInternal(DELIVERYSTARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DeliveryStartDate.
     * @param value value to set the DeliveryStartDate
     */
    public void setDeliveryStartDate(Date value) {
        setAttributeInternal(DELIVERYSTARTDATE, value);
    }

    /**
     * Gets the attribute value for ShipMode, using the alias name ShipMode.
     * @return the ShipMode
     */
    public String getShipMode() {
        return (String)getAttributeInternal(SHIPMODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShipMode.
     * @param value value to set the ShipMode
     */
    public void setShipMode(String value) {
        setAttributeInternal(SHIPMODE, value);
    }

    /**
     * Gets the attribute value for ReplaceBpo, using the alias name ReplaceBpo.
     * @return the ReplaceBpo
     */
    public String getReplaceBpo() {
        return (String)getAttributeInternal(REPLACEBPO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReplaceBpo.
     * @param value value to set the ReplaceBpo
     */
    public void setReplaceBpo(String value) {
        setAttributeInternal(REPLACEBPO, value);
    }

    /**
     * Gets the attribute value for ChildStyleNo, using the alias name ChildStyleNo.
     * @return the ChildStyleNo
     */
    public String getChildStyleNo() {
        return (String)getAttributeInternal(CHILDSTYLENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChildStyleNo.
     * @param value value to set the ChildStyleNo
     */
    public void setChildStyleNo(String value) {
        setAttributeInternal(CHILDSTYLENO, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }


    /**
     * @param detId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number detId) {
        return new Key(new Object[]{detId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_PRECOST_CREATE_BPO_D_S",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setDetId(sVal);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}
