/*
 * XML Type:  WSValorSerieVO
 * Namespace: http://comum.ws.casosdeuso.sgs.pec.bcb.gov.br
 * Java type: br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO
 *
 * Automatically generated - do not modify.
 */
package br.gov.bcb.pec.sgs.casosdeuso.ws.comum.impl;
/**
 * An XML WSValorSerieVO(@http://comum.ws.casosdeuso.sgs.pec.bcb.gov.br).
 *
 * This is a complex type.
 */
public class WSValorSerieVOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO
{
    private static final long serialVersionUID = 1L;
    
    public WSValorSerieVOImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANO$0 = 
        new javax.xml.namespace.QName("", "ano");
    private static final javax.xml.namespace.QName ANOFIM$2 = 
        new javax.xml.namespace.QName("", "anoFim");
    private static final javax.xml.namespace.QName BLOQUEADO$4 = 
        new javax.xml.namespace.QName("", "bloqueado");
    private static final javax.xml.namespace.QName BLOQUEIOLIBERADO$6 = 
        new javax.xml.namespace.QName("", "bloqueioLiberado");
    private static final javax.xml.namespace.QName DIA$8 = 
        new javax.xml.namespace.QName("", "dia");
    private static final javax.xml.namespace.QName DIAFIM$10 = 
        new javax.xml.namespace.QName("", "diaFim");
    private static final javax.xml.namespace.QName MES$12 = 
        new javax.xml.namespace.QName("", "mes");
    private static final javax.xml.namespace.QName MESFIM$14 = 
        new javax.xml.namespace.QName("", "mesFim");
    private static final javax.xml.namespace.QName OID$16 = 
        new javax.xml.namespace.QName("", "oid");
    private static final javax.xml.namespace.QName OIDSERIE$18 = 
        new javax.xml.namespace.QName("", "oidSerie");
    private static final javax.xml.namespace.QName SVALOR$20 = 
        new javax.xml.namespace.QName("", "svalor");
    private static final javax.xml.namespace.QName VALOR$22 = 
        new javax.xml.namespace.QName("", "valor");
    
    
    /**
     * Gets the "ano" element
     */
    public int getAno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANO$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ano" element
     */
    public org.apache.xmlbeans.XmlInt xgetAno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ANO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ano" element
     */
    public void setAno(int ano)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANO$0);
            }
            target.setIntValue(ano);
        }
    }
    
    /**
     * Sets (as xml) the "ano" element
     */
    public void xsetAno(org.apache.xmlbeans.XmlInt ano)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ANO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ANO$0);
            }
            target.set(ano);
        }
    }
    
    /**
     * Gets the "anoFim" element
     */
    public int getAnoFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANOFIM$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "anoFim" element
     */
    public org.apache.xmlbeans.XmlInt xgetAnoFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ANOFIM$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "anoFim" element
     */
    public void setAnoFim(int anoFim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANOFIM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANOFIM$2);
            }
            target.setIntValue(anoFim);
        }
    }
    
    /**
     * Sets (as xml) the "anoFim" element
     */
    public void xsetAnoFim(org.apache.xmlbeans.XmlInt anoFim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ANOFIM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ANOFIM$2);
            }
            target.set(anoFim);
        }
    }
    
    /**
     * Gets the "bloqueado" element
     */
    public boolean getBloqueado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOQUEADO$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "bloqueado" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBloqueado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BLOQUEADO$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bloqueado" element
     */
    public void setBloqueado(boolean bloqueado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOQUEADO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLOQUEADO$4);
            }
            target.setBooleanValue(bloqueado);
        }
    }
    
    /**
     * Sets (as xml) the "bloqueado" element
     */
    public void xsetBloqueado(org.apache.xmlbeans.XmlBoolean bloqueado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BLOQUEADO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BLOQUEADO$4);
            }
            target.set(bloqueado);
        }
    }
    
    /**
     * Gets the "bloqueioLiberado" element
     */
    public boolean getBloqueioLiberado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOQUEIOLIBERADO$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "bloqueioLiberado" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBloqueioLiberado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BLOQUEIOLIBERADO$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bloqueioLiberado" element
     */
    public void setBloqueioLiberado(boolean bloqueioLiberado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOQUEIOLIBERADO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLOQUEIOLIBERADO$6);
            }
            target.setBooleanValue(bloqueioLiberado);
        }
    }
    
    /**
     * Sets (as xml) the "bloqueioLiberado" element
     */
    public void xsetBloqueioLiberado(org.apache.xmlbeans.XmlBoolean bloqueioLiberado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BLOQUEIOLIBERADO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BLOQUEIOLIBERADO$6);
            }
            target.set(bloqueioLiberado);
        }
    }
    
    /**
     * Gets the "dia" element
     */
    public int getDia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIA$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "dia" element
     */
    public org.apache.xmlbeans.XmlInt xgetDia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DIA$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dia" element
     */
    public void setDia(int dia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIA$8);
            }
            target.setIntValue(dia);
        }
    }
    
    /**
     * Sets (as xml) the "dia" element
     */
    public void xsetDia(org.apache.xmlbeans.XmlInt dia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DIA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DIA$8);
            }
            target.set(dia);
        }
    }
    
    /**
     * Gets the "diaFim" element
     */
    public int getDiaFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIAFIM$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "diaFim" element
     */
    public org.apache.xmlbeans.XmlInt xgetDiaFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DIAFIM$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "diaFim" element
     */
    public void setDiaFim(int diaFim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIAFIM$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIAFIM$10);
            }
            target.setIntValue(diaFim);
        }
    }
    
    /**
     * Sets (as xml) the "diaFim" element
     */
    public void xsetDiaFim(org.apache.xmlbeans.XmlInt diaFim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DIAFIM$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DIAFIM$10);
            }
            target.set(diaFim);
        }
    }
    
    /**
     * Gets the "mes" element
     */
    public int getMes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MES$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "mes" element
     */
    public org.apache.xmlbeans.XmlInt xgetMes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MES$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mes" element
     */
    public void setMes(int mes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MES$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MES$12);
            }
            target.setIntValue(mes);
        }
    }
    
    /**
     * Sets (as xml) the "mes" element
     */
    public void xsetMes(org.apache.xmlbeans.XmlInt mes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MES$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MES$12);
            }
            target.set(mes);
        }
    }
    
    /**
     * Gets the "mesFim" element
     */
    public int getMesFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESFIM$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "mesFim" element
     */
    public org.apache.xmlbeans.XmlInt xgetMesFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MESFIM$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mesFim" element
     */
    public void setMesFim(int mesFim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESFIM$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESFIM$14);
            }
            target.setIntValue(mesFim);
        }
    }
    
    /**
     * Sets (as xml) the "mesFim" element
     */
    public void xsetMesFim(org.apache.xmlbeans.XmlInt mesFim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MESFIM$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MESFIM$14);
            }
            target.set(mesFim);
        }
    }
    
    /**
     * Gets the "oid" element
     */
    public long getOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OID$16, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "oid" element
     */
    public org.apache.xmlbeans.XmlLong xgetOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(OID$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "oid" element
     */
    public void setOid(long oid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OID$16);
            }
            target.setLongValue(oid);
        }
    }
    
    /**
     * Sets (as xml) the "oid" element
     */
    public void xsetOid(org.apache.xmlbeans.XmlLong oid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(OID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(OID$16);
            }
            target.set(oid);
        }
    }
    
    /**
     * Gets the "oidSerie" element
     */
    public long getOidSerie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OIDSERIE$18, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "oidSerie" element
     */
    public org.apache.xmlbeans.XmlLong xgetOidSerie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(OIDSERIE$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "oidSerie" element
     */
    public void setOidSerie(long oidSerie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OIDSERIE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OIDSERIE$18);
            }
            target.setLongValue(oidSerie);
        }
    }
    
    /**
     * Sets (as xml) the "oidSerie" element
     */
    public void xsetOidSerie(org.apache.xmlbeans.XmlLong oidSerie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(OIDSERIE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(OIDSERIE$18);
            }
            target.set(oidSerie);
        }
    }
    
    /**
     * Gets the "svalor" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getSvalor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(SVALOR$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "svalor" element
     */
    public boolean isNilSvalor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(SVALOR$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "svalor" element
     */
    public void setSvalor(org.xmlsoap.schemas.soap.encoding.String svalor)
    {
        generatedSetterHelperImpl(svalor, SVALOR$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "svalor" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewSvalor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(SVALOR$20);
            return target;
        }
    }
    
    /**
     * Nils the "svalor" element
     */
    public void setNilSvalor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(SVALOR$20, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(SVALOR$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "valor" element
     */
    public org.xmlsoap.schemas.soap.encoding.Decimal getValor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Decimal target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().find_element_user(VALOR$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "valor" element
     */
    public boolean isNilValor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Decimal target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().find_element_user(VALOR$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "valor" element
     */
    public void setValor(org.xmlsoap.schemas.soap.encoding.Decimal valor)
    {
        generatedSetterHelperImpl(valor, VALOR$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valor" element
     */
    public org.xmlsoap.schemas.soap.encoding.Decimal addNewValor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Decimal target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().add_element_user(VALOR$22);
            return target;
        }
    }
    
    /**
     * Nils the "valor" element
     */
    public void setNilValor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Decimal target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().find_element_user(VALOR$22, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().add_element_user(VALOR$22);
            }
            target.setNil();
        }
    }
}
