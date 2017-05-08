/*
 * XML Type:  WSSerieVO
 * Namespace: http://comum.ws.casosdeuso.sgs.pec.bcb.gov.br
 * Java type: br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO
 *
 * Automatically generated - do not modify.
 */
package br.gov.bcb.pec.sgs.casosdeuso.ws.comum.impl;
/**
 * An XML WSSerieVO(@http://comum.ws.casosdeuso.sgs.pec.bcb.gov.br).
 *
 * This is a complex type.
 */
public class WSSerieVOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO
{
    private static final long serialVersionUID = 1L;
    
    public WSSerieVOImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANOFIM$0 = 
        new javax.xml.namespace.QName("", "anoFim");
    private static final javax.xml.namespace.QName ANOINICIO$2 = 
        new javax.xml.namespace.QName("", "anoInicio");
    private static final javax.xml.namespace.QName AVISO$4 = 
        new javax.xml.namespace.QName("", "aviso");
    private static final javax.xml.namespace.QName DIAFIM$6 = 
        new javax.xml.namespace.QName("", "diaFim");
    private static final javax.xml.namespace.QName DIAINICIO$8 = 
        new javax.xml.namespace.QName("", "diaInicio");
    private static final javax.xml.namespace.QName ESPECIAL$10 = 
        new javax.xml.namespace.QName("", "especial");
    private static final javax.xml.namespace.QName FONTE$12 = 
        new javax.xml.namespace.QName("", "fonte");
    private static final javax.xml.namespace.QName FULLNAME$14 = 
        new javax.xml.namespace.QName("", "fullName");
    private static final javax.xml.namespace.QName GESTORPROPRIETARIO$16 = 
        new javax.xml.namespace.QName("", "gestorProprietario");
    private static final javax.xml.namespace.QName MESFIM$18 = 
        new javax.xml.namespace.QName("", "mesFim");
    private static final javax.xml.namespace.QName MESINICIO$20 = 
        new javax.xml.namespace.QName("", "mesInicio");
    private static final javax.xml.namespace.QName NOMEABREVIADO$22 = 
        new javax.xml.namespace.QName("", "nomeAbreviado");
    private static final javax.xml.namespace.QName NOMECOMPLETO$24 = 
        new javax.xml.namespace.QName("", "nomeCompleto");
    private static final javax.xml.namespace.QName OID$26 = 
        new javax.xml.namespace.QName("", "oid");
    private static final javax.xml.namespace.QName PERIODICIDADE$28 = 
        new javax.xml.namespace.QName("", "periodicidade");
    private static final javax.xml.namespace.QName PERIODICIDADESIGLA$30 = 
        new javax.xml.namespace.QName("", "periodicidadeSigla");
    private static final javax.xml.namespace.QName POSSUIBLOQUEIOS$32 = 
        new javax.xml.namespace.QName("", "possuiBloqueios");
    private static final javax.xml.namespace.QName PUBLICA$34 = 
        new javax.xml.namespace.QName("", "publica");
    private static final javax.xml.namespace.QName SHORTNAME$36 = 
        new javax.xml.namespace.QName("", "shortName");
    private static final javax.xml.namespace.QName ULTIMOVALOR$38 = 
        new javax.xml.namespace.QName("", "ultimoValor");
    private static final javax.xml.namespace.QName UNIDADEPADRAO$40 = 
        new javax.xml.namespace.QName("", "unidadePadrao");
    private static final javax.xml.namespace.QName UNIDADEPADRAOINGLES$42 = 
        new javax.xml.namespace.QName("", "unidadePadraoIngles");
    private static final javax.xml.namespace.QName VALORDIANAOUTIL$44 = 
        new javax.xml.namespace.QName("", "valorDiaNaoUtil");
    private static final javax.xml.namespace.QName VALORES$46 = 
        new javax.xml.namespace.QName("", "valores");
    
    
    /**
     * Gets the "anoFim" element
     */
    public int getAnoFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANOFIM$0, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ANOFIM$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANOFIM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANOFIM$0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ANOFIM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ANOFIM$0);
            }
            target.set(anoFim);
        }
    }
    
    /**
     * Gets the "anoInicio" element
     */
    public int getAnoInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANOINICIO$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "anoInicio" element
     */
    public org.apache.xmlbeans.XmlInt xgetAnoInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ANOINICIO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "anoInicio" element
     */
    public void setAnoInicio(int anoInicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANOINICIO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANOINICIO$2);
            }
            target.setIntValue(anoInicio);
        }
    }
    
    /**
     * Sets (as xml) the "anoInicio" element
     */
    public void xsetAnoInicio(org.apache.xmlbeans.XmlInt anoInicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ANOINICIO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ANOINICIO$2);
            }
            target.set(anoInicio);
        }
    }
    
    /**
     * Gets the "aviso" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getAviso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(AVISO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "aviso" element
     */
    public boolean isNilAviso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(AVISO$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "aviso" element
     */
    public void setAviso(org.xmlsoap.schemas.soap.encoding.String aviso)
    {
        generatedSetterHelperImpl(aviso, AVISO$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "aviso" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewAviso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(AVISO$4);
            return target;
        }
    }
    
    /**
     * Nils the "aviso" element
     */
    public void setNilAviso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(AVISO$4, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(AVISO$4);
            }
            target.setNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIAFIM$6, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DIAFIM$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIAFIM$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIAFIM$6);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DIAFIM$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DIAFIM$6);
            }
            target.set(diaFim);
        }
    }
    
    /**
     * Gets the "diaInicio" element
     */
    public int getDiaInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIAINICIO$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "diaInicio" element
     */
    public org.apache.xmlbeans.XmlInt xgetDiaInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DIAINICIO$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "diaInicio" element
     */
    public void setDiaInicio(int diaInicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIAINICIO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIAINICIO$8);
            }
            target.setIntValue(diaInicio);
        }
    }
    
    /**
     * Sets (as xml) the "diaInicio" element
     */
    public void xsetDiaInicio(org.apache.xmlbeans.XmlInt diaInicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DIAINICIO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DIAINICIO$8);
            }
            target.set(diaInicio);
        }
    }
    
    /**
     * Gets the "especial" element
     */
    public boolean getEspecial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESPECIAL$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "especial" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetEspecial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ESPECIAL$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "especial" element
     */
    public void setEspecial(boolean especial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESPECIAL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESPECIAL$10);
            }
            target.setBooleanValue(especial);
        }
    }
    
    /**
     * Sets (as xml) the "especial" element
     */
    public void xsetEspecial(org.apache.xmlbeans.XmlBoolean especial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ESPECIAL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ESPECIAL$10);
            }
            target.set(especial);
        }
    }
    
    /**
     * Gets the "fonte" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getFonte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(FONTE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "fonte" element
     */
    public boolean isNilFonte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(FONTE$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "fonte" element
     */
    public void setFonte(org.xmlsoap.schemas.soap.encoding.String fonte)
    {
        generatedSetterHelperImpl(fonte, FONTE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fonte" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewFonte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(FONTE$12);
            return target;
        }
    }
    
    /**
     * Nils the "fonte" element
     */
    public void setNilFonte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(FONTE$12, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(FONTE$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "fullName" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(FULLNAME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "fullName" element
     */
    public boolean isNilFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(FULLNAME$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "fullName" element
     */
    public void setFullName(org.xmlsoap.schemas.soap.encoding.String fullName)
    {
        generatedSetterHelperImpl(fullName, FULLNAME$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fullName" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(FULLNAME$14);
            return target;
        }
    }
    
    /**
     * Nils the "fullName" element
     */
    public void setNilFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(FULLNAME$14, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(FULLNAME$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "gestorProprietario" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getGestorProprietario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(GESTORPROPRIETARIO$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "gestorProprietario" element
     */
    public boolean isNilGestorProprietario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(GESTORPROPRIETARIO$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "gestorProprietario" element
     */
    public void setGestorProprietario(org.xmlsoap.schemas.soap.encoding.String gestorProprietario)
    {
        generatedSetterHelperImpl(gestorProprietario, GESTORPROPRIETARIO$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "gestorProprietario" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewGestorProprietario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(GESTORPROPRIETARIO$16);
            return target;
        }
    }
    
    /**
     * Nils the "gestorProprietario" element
     */
    public void setNilGestorProprietario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(GESTORPROPRIETARIO$16, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(GESTORPROPRIETARIO$16);
            }
            target.setNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESFIM$18, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MESFIM$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESFIM$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESFIM$18);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MESFIM$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MESFIM$18);
            }
            target.set(mesFim);
        }
    }
    
    /**
     * Gets the "mesInicio" element
     */
    public int getMesInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESINICIO$20, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "mesInicio" element
     */
    public org.apache.xmlbeans.XmlInt xgetMesInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MESINICIO$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mesInicio" element
     */
    public void setMesInicio(int mesInicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESINICIO$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESINICIO$20);
            }
            target.setIntValue(mesInicio);
        }
    }
    
    /**
     * Sets (as xml) the "mesInicio" element
     */
    public void xsetMesInicio(org.apache.xmlbeans.XmlInt mesInicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MESINICIO$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MESINICIO$20);
            }
            target.set(mesInicio);
        }
    }
    
    /**
     * Gets the "nomeAbreviado" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getNomeAbreviado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NOMEABREVIADO$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "nomeAbreviado" element
     */
    public boolean isNilNomeAbreviado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NOMEABREVIADO$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "nomeAbreviado" element
     */
    public void setNomeAbreviado(org.xmlsoap.schemas.soap.encoding.String nomeAbreviado)
    {
        generatedSetterHelperImpl(nomeAbreviado, NOMEABREVIADO$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "nomeAbreviado" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewNomeAbreviado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(NOMEABREVIADO$22);
            return target;
        }
    }
    
    /**
     * Nils the "nomeAbreviado" element
     */
    public void setNilNomeAbreviado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NOMEABREVIADO$22, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(NOMEABREVIADO$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "nomeCompleto" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getNomeCompleto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NOMECOMPLETO$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "nomeCompleto" element
     */
    public boolean isNilNomeCompleto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NOMECOMPLETO$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "nomeCompleto" element
     */
    public void setNomeCompleto(org.xmlsoap.schemas.soap.encoding.String nomeCompleto)
    {
        generatedSetterHelperImpl(nomeCompleto, NOMECOMPLETO$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "nomeCompleto" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewNomeCompleto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(NOMECOMPLETO$24);
            return target;
        }
    }
    
    /**
     * Nils the "nomeCompleto" element
     */
    public void setNilNomeCompleto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NOMECOMPLETO$24, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(NOMECOMPLETO$24);
            }
            target.setNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OID$26, 0);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(OID$26, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OID$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OID$26);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(OID$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(OID$26);
            }
            target.set(oid);
        }
    }
    
    /**
     * Gets the "periodicidade" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getPeriodicidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PERIODICIDADE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "periodicidade" element
     */
    public boolean isNilPeriodicidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PERIODICIDADE$28, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "periodicidade" element
     */
    public void setPeriodicidade(org.xmlsoap.schemas.soap.encoding.String periodicidade)
    {
        generatedSetterHelperImpl(periodicidade, PERIODICIDADE$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "periodicidade" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewPeriodicidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(PERIODICIDADE$28);
            return target;
        }
    }
    
    /**
     * Nils the "periodicidade" element
     */
    public void setNilPeriodicidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PERIODICIDADE$28, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(PERIODICIDADE$28);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "periodicidadeSigla" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getPeriodicidadeSigla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PERIODICIDADESIGLA$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "periodicidadeSigla" element
     */
    public boolean isNilPeriodicidadeSigla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PERIODICIDADESIGLA$30, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "periodicidadeSigla" element
     */
    public void setPeriodicidadeSigla(org.xmlsoap.schemas.soap.encoding.String periodicidadeSigla)
    {
        generatedSetterHelperImpl(periodicidadeSigla, PERIODICIDADESIGLA$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "periodicidadeSigla" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewPeriodicidadeSigla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(PERIODICIDADESIGLA$30);
            return target;
        }
    }
    
    /**
     * Nils the "periodicidadeSigla" element
     */
    public void setNilPeriodicidadeSigla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PERIODICIDADESIGLA$30, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(PERIODICIDADESIGLA$30);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "possuiBloqueios" element
     */
    public boolean getPossuiBloqueios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSSUIBLOQUEIOS$32, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "possuiBloqueios" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPossuiBloqueios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(POSSUIBLOQUEIOS$32, 0);
            return target;
        }
    }
    
    /**
     * Sets the "possuiBloqueios" element
     */
    public void setPossuiBloqueios(boolean possuiBloqueios)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSSUIBLOQUEIOS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSSUIBLOQUEIOS$32);
            }
            target.setBooleanValue(possuiBloqueios);
        }
    }
    
    /**
     * Sets (as xml) the "possuiBloqueios" element
     */
    public void xsetPossuiBloqueios(org.apache.xmlbeans.XmlBoolean possuiBloqueios)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(POSSUIBLOQUEIOS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(POSSUIBLOQUEIOS$32);
            }
            target.set(possuiBloqueios);
        }
    }
    
    /**
     * Gets the "publica" element
     */
    public boolean getPublica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICA$34, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "publica" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPublica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PUBLICA$34, 0);
            return target;
        }
    }
    
    /**
     * Sets the "publica" element
     */
    public void setPublica(boolean publica)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICA$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLICA$34);
            }
            target.setBooleanValue(publica);
        }
    }
    
    /**
     * Sets (as xml) the "publica" element
     */
    public void xsetPublica(org.apache.xmlbeans.XmlBoolean publica)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PUBLICA$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PUBLICA$34);
            }
            target.set(publica);
        }
    }
    
    /**
     * Gets the "shortName" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(SHORTNAME$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "shortName" element
     */
    public boolean isNilShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(SHORTNAME$36, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "shortName" element
     */
    public void setShortName(org.xmlsoap.schemas.soap.encoding.String shortName)
    {
        generatedSetterHelperImpl(shortName, SHORTNAME$36, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "shortName" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(SHORTNAME$36);
            return target;
        }
    }
    
    /**
     * Nils the "shortName" element
     */
    public void setNilShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(SHORTNAME$36, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(SHORTNAME$36);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "ultimoValor" element
     */
    public br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO getUltimoValor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO target = null;
            target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO)get_store().find_element_user(ULTIMOVALOR$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ultimoValor" element
     */
    public boolean isNilUltimoValor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO target = null;
            target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO)get_store().find_element_user(ULTIMOVALOR$38, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ultimoValor" element
     */
    public void setUltimoValor(br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO ultimoValor)
    {
        generatedSetterHelperImpl(ultimoValor, ULTIMOVALOR$38, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ultimoValor" element
     */
    public br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO addNewUltimoValor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO target = null;
            target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO)get_store().add_element_user(ULTIMOVALOR$38);
            return target;
        }
    }
    
    /**
     * Nils the "ultimoValor" element
     */
    public void setNilUltimoValor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO target = null;
            target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO)get_store().find_element_user(ULTIMOVALOR$38, 0);
            if (target == null)
            {
                target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO)get_store().add_element_user(ULTIMOVALOR$38);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "unidadePadrao" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getUnidadePadrao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(UNIDADEPADRAO$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "unidadePadrao" element
     */
    public boolean isNilUnidadePadrao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(UNIDADEPADRAO$40, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "unidadePadrao" element
     */
    public void setUnidadePadrao(org.xmlsoap.schemas.soap.encoding.String unidadePadrao)
    {
        generatedSetterHelperImpl(unidadePadrao, UNIDADEPADRAO$40, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "unidadePadrao" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewUnidadePadrao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(UNIDADEPADRAO$40);
            return target;
        }
    }
    
    /**
     * Nils the "unidadePadrao" element
     */
    public void setNilUnidadePadrao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(UNIDADEPADRAO$40, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(UNIDADEPADRAO$40);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "unidadePadraoIngles" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getUnidadePadraoIngles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(UNIDADEPADRAOINGLES$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "unidadePadraoIngles" element
     */
    public boolean isNilUnidadePadraoIngles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(UNIDADEPADRAOINGLES$42, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "unidadePadraoIngles" element
     */
    public void setUnidadePadraoIngles(org.xmlsoap.schemas.soap.encoding.String unidadePadraoIngles)
    {
        generatedSetterHelperImpl(unidadePadraoIngles, UNIDADEPADRAOINGLES$42, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "unidadePadraoIngles" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewUnidadePadraoIngles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(UNIDADEPADRAOINGLES$42);
            return target;
        }
    }
    
    /**
     * Nils the "unidadePadraoIngles" element
     */
    public void setNilUnidadePadraoIngles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(UNIDADEPADRAOINGLES$42, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(UNIDADEPADRAOINGLES$42);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "valorDiaNaoUtil" element
     */
    public boolean getValorDiaNaoUtil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALORDIANAOUTIL$44, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "valorDiaNaoUtil" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetValorDiaNaoUtil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALORDIANAOUTIL$44, 0);
            return target;
        }
    }
    
    /**
     * Sets the "valorDiaNaoUtil" element
     */
    public void setValorDiaNaoUtil(boolean valorDiaNaoUtil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALORDIANAOUTIL$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALORDIANAOUTIL$44);
            }
            target.setBooleanValue(valorDiaNaoUtil);
        }
    }
    
    /**
     * Sets (as xml) the "valorDiaNaoUtil" element
     */
    public void xsetValorDiaNaoUtil(org.apache.xmlbeans.XmlBoolean valorDiaNaoUtil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALORDIANAOUTIL$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(VALORDIANAOUTIL$44);
            }
            target.set(valorDiaNaoUtil);
        }
    }
    
    /**
     * Gets the "valores" element
     */
    public was_p.wssgs.services.fachadawssgs.ArrayOfTns2WSValorSerieVO getValores()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.ArrayOfTns2WSValorSerieVO target = null;
            target = (was_p.wssgs.services.fachadawssgs.ArrayOfTns2WSValorSerieVO)get_store().find_element_user(VALORES$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "valores" element
     */
    public boolean isNilValores()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.ArrayOfTns2WSValorSerieVO target = null;
            target = (was_p.wssgs.services.fachadawssgs.ArrayOfTns2WSValorSerieVO)get_store().find_element_user(VALORES$46, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "valores" element
     */
    public void setValores(was_p.wssgs.services.fachadawssgs.ArrayOfTns2WSValorSerieVO valores)
    {
        generatedSetterHelperImpl(valores, VALORES$46, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valores" element
     */
    public was_p.wssgs.services.fachadawssgs.ArrayOfTns2WSValorSerieVO addNewValores()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.ArrayOfTns2WSValorSerieVO target = null;
            target = (was_p.wssgs.services.fachadawssgs.ArrayOfTns2WSValorSerieVO)get_store().add_element_user(VALORES$46);
            return target;
        }
    }
    
    /**
     * Nils the "valores" element
     */
    public void setNilValores()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.ArrayOfTns2WSValorSerieVO target = null;
            target = (was_p.wssgs.services.fachadawssgs.ArrayOfTns2WSValorSerieVO)get_store().find_element_user(VALORES$46, 0);
            if (target == null)
            {
                target = (was_p.wssgs.services.fachadawssgs.ArrayOfTns2WSValorSerieVO)get_store().add_element_user(VALORES$46);
            }
            target.setNil();
        }
    }
}
