/*
 * An XML document type.
 * Localname: getValoresSeriesXMLResponse
 * Namespace: https://was-p/wssgs/services/FachadaWSSGS
 * Java type: was_p.wssgs.services.fachadawssgs.GetValoresSeriesXMLResponseDocument
 *
 * Automatically generated - do not modify.
 */
package was_p.wssgs.services.fachadawssgs.impl;
/**
 * A document containing one getValoresSeriesXMLResponse(@https://was-p/wssgs/services/FachadaWSSGS) element.
 *
 * This is a complex type.
 */
public class GetValoresSeriesXMLResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetValoresSeriesXMLResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetValoresSeriesXMLResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVALORESSERIESXMLRESPONSE$0 = 
        new javax.xml.namespace.QName("https://was-p/wssgs/services/FachadaWSSGS", "getValoresSeriesXMLResponse");
    
    
    /**
     * Gets the "getValoresSeriesXMLResponse" element
     */
    public was_p.wssgs.services.fachadawssgs.GetValoresSeriesXMLResponseDocument.GetValoresSeriesXMLResponse getGetValoresSeriesXMLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetValoresSeriesXMLResponseDocument.GetValoresSeriesXMLResponse target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetValoresSeriesXMLResponseDocument.GetValoresSeriesXMLResponse)get_store().find_element_user(GETVALORESSERIESXMLRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getValoresSeriesXMLResponse" element
     */
    public void setGetValoresSeriesXMLResponse(was_p.wssgs.services.fachadawssgs.GetValoresSeriesXMLResponseDocument.GetValoresSeriesXMLResponse getValoresSeriesXMLResponse)
    {
        generatedSetterHelperImpl(getValoresSeriesXMLResponse, GETVALORESSERIESXMLRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getValoresSeriesXMLResponse" element
     */
    public was_p.wssgs.services.fachadawssgs.GetValoresSeriesXMLResponseDocument.GetValoresSeriesXMLResponse addNewGetValoresSeriesXMLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetValoresSeriesXMLResponseDocument.GetValoresSeriesXMLResponse target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetValoresSeriesXMLResponseDocument.GetValoresSeriesXMLResponse)get_store().add_element_user(GETVALORESSERIESXMLRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getValoresSeriesXMLResponse(@https://was-p/wssgs/services/FachadaWSSGS).
     *
     * This is a complex type.
     */
    public static class GetValoresSeriesXMLResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetValoresSeriesXMLResponseDocument.GetValoresSeriesXMLResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetValoresSeriesXMLResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETVALORESSERIESXMLRETURN$0 = 
            new javax.xml.namespace.QName("", "getValoresSeriesXMLReturn");
        
        
        /**
         * Gets the "getValoresSeriesXMLReturn" element
         */
        public org.xmlsoap.schemas.soap.encoding.String getGetValoresSeriesXMLReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(GETVALORESSERIESXMLRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "getValoresSeriesXMLReturn" element
         */
        public boolean isNilGetValoresSeriesXMLReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(GETVALORESSERIESXMLRETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "getValoresSeriesXMLReturn" element
         */
        public void setGetValoresSeriesXMLReturn(org.xmlsoap.schemas.soap.encoding.String getValoresSeriesXMLReturn)
        {
            generatedSetterHelperImpl(getValoresSeriesXMLReturn, GETVALORESSERIESXMLRETURN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "getValoresSeriesXMLReturn" element
         */
        public org.xmlsoap.schemas.soap.encoding.String addNewGetValoresSeriesXMLReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(GETVALORESSERIESXMLRETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "getValoresSeriesXMLReturn" element
         */
        public void setNilGetValoresSeriesXMLReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(GETVALORESSERIESXMLRETURN$0, 0);
                if (target == null)
                {
                    target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(GETVALORESSERIESXMLRETURN$0);
                }
                target.setNil();
            }
        }
    }
}
