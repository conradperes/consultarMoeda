/*
 * An XML document type.
 * Localname: getUltimosValoresSerieVOResponse
 * Namespace: https://was-p/wssgs/services/FachadaWSSGS
 * Java type: was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument
 *
 * Automatically generated - do not modify.
 */
package was_p.wssgs.services.fachadawssgs.impl;
/**
 * A document containing one getUltimosValoresSerieVOResponse(@https://was-p/wssgs/services/FachadaWSSGS) element.
 *
 * This is a complex type.
 */
public class GetUltimosValoresSerieVOResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetUltimosValoresSerieVOResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETULTIMOSVALORESSERIEVORESPONSE$0 = 
        new javax.xml.namespace.QName("https://was-p/wssgs/services/FachadaWSSGS", "getUltimosValoresSerieVOResponse");
    
    
    /**
     * Gets the "getUltimosValoresSerieVOResponse" element
     */
    public was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument.GetUltimosValoresSerieVOResponse getGetUltimosValoresSerieVOResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument.GetUltimosValoresSerieVOResponse target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument.GetUltimosValoresSerieVOResponse)get_store().find_element_user(GETULTIMOSVALORESSERIEVORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getUltimosValoresSerieVOResponse" element
     */
    public void setGetUltimosValoresSerieVOResponse(was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument.GetUltimosValoresSerieVOResponse getUltimosValoresSerieVOResponse)
    {
        generatedSetterHelperImpl(getUltimosValoresSerieVOResponse, GETULTIMOSVALORESSERIEVORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getUltimosValoresSerieVOResponse" element
     */
    public was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument.GetUltimosValoresSerieVOResponse addNewGetUltimosValoresSerieVOResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument.GetUltimosValoresSerieVOResponse target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument.GetUltimosValoresSerieVOResponse)get_store().add_element_user(GETULTIMOSVALORESSERIEVORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getUltimosValoresSerieVOResponse(@https://was-p/wssgs/services/FachadaWSSGS).
     *
     * This is a complex type.
     */
    public static class GetUltimosValoresSerieVOResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument.GetUltimosValoresSerieVOResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetUltimosValoresSerieVOResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETULTIMOSVALORESSERIEVORETURN$0 = 
            new javax.xml.namespace.QName("", "getUltimosValoresSerieVOReturn");
        
        
        /**
         * Gets the "getUltimosValoresSerieVOReturn" element
         */
        public br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO getGetUltimosValoresSerieVOReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO target = null;
                target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO)get_store().find_element_user(GETULTIMOSVALORESSERIEVORETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "getUltimosValoresSerieVOReturn" element
         */
        public boolean isNilGetUltimosValoresSerieVOReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO target = null;
                target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO)get_store().find_element_user(GETULTIMOSVALORESSERIEVORETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "getUltimosValoresSerieVOReturn" element
         */
        public void setGetUltimosValoresSerieVOReturn(br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO getUltimosValoresSerieVOReturn)
        {
            generatedSetterHelperImpl(getUltimosValoresSerieVOReturn, GETULTIMOSVALORESSERIEVORETURN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "getUltimosValoresSerieVOReturn" element
         */
        public br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO addNewGetUltimosValoresSerieVOReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO target = null;
                target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO)get_store().add_element_user(GETULTIMOSVALORESSERIEVORETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "getUltimosValoresSerieVOReturn" element
         */
        public void setNilGetUltimosValoresSerieVOReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO target = null;
                target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO)get_store().find_element_user(GETULTIMOSVALORESSERIEVORETURN$0, 0);
                if (target == null)
                {
                    target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO)get_store().add_element_user(GETULTIMOSVALORESSERIEVORETURN$0);
                }
                target.setNil();
            }
        }
    }
}
