/*
 * An XML document type.
 * Localname: getValorResponse
 * Namespace: https://was-p/wssgs/services/FachadaWSSGS
 * Java type: was_p.wssgs.services.fachadawssgs.GetValorResponseDocument
 *
 * Automatically generated - do not modify.
 */
package was_p.wssgs.services.fachadawssgs.impl;
/**
 * A document containing one getValorResponse(@https://was-p/wssgs/services/FachadaWSSGS) element.
 *
 * This is a complex type.
 */
public class GetValorResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetValorResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetValorResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVALORRESPONSE$0 = 
        new javax.xml.namespace.QName("https://was-p/wssgs/services/FachadaWSSGS", "getValorResponse");
    
    
    /**
     * Gets the "getValorResponse" element
     */
    public was_p.wssgs.services.fachadawssgs.GetValorResponseDocument.GetValorResponse getGetValorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetValorResponseDocument.GetValorResponse target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument.GetValorResponse)get_store().find_element_user(GETVALORRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getValorResponse" element
     */
    public void setGetValorResponse(was_p.wssgs.services.fachadawssgs.GetValorResponseDocument.GetValorResponse getValorResponse)
    {
        generatedSetterHelperImpl(getValorResponse, GETVALORRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getValorResponse" element
     */
    public was_p.wssgs.services.fachadawssgs.GetValorResponseDocument.GetValorResponse addNewGetValorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetValorResponseDocument.GetValorResponse target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument.GetValorResponse)get_store().add_element_user(GETVALORRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getValorResponse(@https://was-p/wssgs/services/FachadaWSSGS).
     *
     * This is a complex type.
     */
    public static class GetValorResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetValorResponseDocument.GetValorResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetValorResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETVALORRETURN$0 = 
            new javax.xml.namespace.QName("", "getValorReturn");
        
        
        /**
         * Gets the "getValorReturn" element
         */
        public org.xmlsoap.schemas.soap.encoding.Decimal getGetValorReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.Decimal target = null;
                target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().find_element_user(GETVALORRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "getValorReturn" element
         */
        public boolean isNilGetValorReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.Decimal target = null;
                target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().find_element_user(GETVALORRETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "getValorReturn" element
         */
        public void setGetValorReturn(org.xmlsoap.schemas.soap.encoding.Decimal getValorReturn)
        {
            generatedSetterHelperImpl(getValorReturn, GETVALORRETURN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "getValorReturn" element
         */
        public org.xmlsoap.schemas.soap.encoding.Decimal addNewGetValorReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.Decimal target = null;
                target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().add_element_user(GETVALORRETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "getValorReturn" element
         */
        public void setNilGetValorReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.Decimal target = null;
                target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().find_element_user(GETVALORRETURN$0, 0);
                if (target == null)
                {
                    target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().add_element_user(GETVALORRETURN$0);
                }
                target.setNil();
            }
        }
    }
}
