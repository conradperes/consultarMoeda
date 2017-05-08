/*
 * An XML document type.
 * Localname: getUltimoValorXMLResponse
 * Namespace: https://was-p/wssgs/services/FachadaWSSGS
 * Java type: was_p.wssgs.services.fachadawssgs.GetUltimoValorXMLResponseDocument
 *
 * Automatically generated - do not modify.
 */
package was_p.wssgs.services.fachadawssgs.impl;
/**
 * A document containing one getUltimoValorXMLResponse(@https://was-p/wssgs/services/FachadaWSSGS) element.
 *
 * This is a complex type.
 */
public class GetUltimoValorXMLResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetUltimoValorXMLResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetUltimoValorXMLResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETULTIMOVALORXMLRESPONSE$0 = 
        new javax.xml.namespace.QName("https://was-p/wssgs/services/FachadaWSSGS", "getUltimoValorXMLResponse");
    
    
    /**
     * Gets the "getUltimoValorXMLResponse" element
     */
    public was_p.wssgs.services.fachadawssgs.GetUltimoValorXMLResponseDocument.GetUltimoValorXMLResponse getGetUltimoValorXMLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetUltimoValorXMLResponseDocument.GetUltimoValorXMLResponse target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetUltimoValorXMLResponseDocument.GetUltimoValorXMLResponse)get_store().find_element_user(GETULTIMOVALORXMLRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getUltimoValorXMLResponse" element
     */
    public void setGetUltimoValorXMLResponse(was_p.wssgs.services.fachadawssgs.GetUltimoValorXMLResponseDocument.GetUltimoValorXMLResponse getUltimoValorXMLResponse)
    {
        generatedSetterHelperImpl(getUltimoValorXMLResponse, GETULTIMOVALORXMLRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getUltimoValorXMLResponse" element
     */
    public was_p.wssgs.services.fachadawssgs.GetUltimoValorXMLResponseDocument.GetUltimoValorXMLResponse addNewGetUltimoValorXMLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetUltimoValorXMLResponseDocument.GetUltimoValorXMLResponse target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetUltimoValorXMLResponseDocument.GetUltimoValorXMLResponse)get_store().add_element_user(GETULTIMOVALORXMLRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getUltimoValorXMLResponse(@https://was-p/wssgs/services/FachadaWSSGS).
     *
     * This is a complex type.
     */
    public static class GetUltimoValorXMLResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetUltimoValorXMLResponseDocument.GetUltimoValorXMLResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetUltimoValorXMLResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETULTIMOVALORXMLRETURN$0 = 
            new javax.xml.namespace.QName("", "getUltimoValorXMLReturn");
        
        
        /**
         * Gets the "getUltimoValorXMLReturn" element
         */
        public org.xmlsoap.schemas.soap.encoding.String getGetUltimoValorXMLReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(GETULTIMOVALORXMLRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "getUltimoValorXMLReturn" element
         */
        public boolean isNilGetUltimoValorXMLReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(GETULTIMOVALORXMLRETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "getUltimoValorXMLReturn" element
         */
        public void setGetUltimoValorXMLReturn(org.xmlsoap.schemas.soap.encoding.String getUltimoValorXMLReturn)
        {
            generatedSetterHelperImpl(getUltimoValorXMLReturn, GETULTIMOVALORXMLRETURN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "getUltimoValorXMLReturn" element
         */
        public org.xmlsoap.schemas.soap.encoding.String addNewGetUltimoValorXMLReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(GETULTIMOVALORXMLRETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "getUltimoValorXMLReturn" element
         */
        public void setNilGetUltimoValorXMLReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(GETULTIMOVALORXMLRETURN$0, 0);
                if (target == null)
                {
                    target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(GETULTIMOVALORXMLRETURN$0);
                }
                target.setNil();
            }
        }
    }
}
