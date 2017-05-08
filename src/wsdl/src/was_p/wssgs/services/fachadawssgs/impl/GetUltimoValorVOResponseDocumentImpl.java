/*
 * An XML document type.
 * Localname: getUltimoValorVOResponse
 * Namespace: https://was-p/wssgs/services/FachadaWSSGS
 * Java type: was_p.wssgs.services.fachadawssgs.GetUltimoValorVOResponseDocument
 *
 * Automatically generated - do not modify.
 */
package was_p.wssgs.services.fachadawssgs.impl;
/**
 * A document containing one getUltimoValorVOResponse(@https://was-p/wssgs/services/FachadaWSSGS) element.
 *
 * This is a complex type.
 */
public class GetUltimoValorVOResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetUltimoValorVOResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetUltimoValorVOResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETULTIMOVALORVORESPONSE$0 = 
        new javax.xml.namespace.QName("https://was-p/wssgs/services/FachadaWSSGS", "getUltimoValorVOResponse");
    
    
    /**
     * Gets the "getUltimoValorVOResponse" element
     */
    public was_p.wssgs.services.fachadawssgs.GetUltimoValorVOResponseDocument.GetUltimoValorVOResponse getGetUltimoValorVOResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetUltimoValorVOResponseDocument.GetUltimoValorVOResponse target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetUltimoValorVOResponseDocument.GetUltimoValorVOResponse)get_store().find_element_user(GETULTIMOVALORVORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getUltimoValorVOResponse" element
     */
    public void setGetUltimoValorVOResponse(was_p.wssgs.services.fachadawssgs.GetUltimoValorVOResponseDocument.GetUltimoValorVOResponse getUltimoValorVOResponse)
    {
        generatedSetterHelperImpl(getUltimoValorVOResponse, GETULTIMOVALORVORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getUltimoValorVOResponse" element
     */
    public was_p.wssgs.services.fachadawssgs.GetUltimoValorVOResponseDocument.GetUltimoValorVOResponse addNewGetUltimoValorVOResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetUltimoValorVOResponseDocument.GetUltimoValorVOResponse target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetUltimoValorVOResponseDocument.GetUltimoValorVOResponse)get_store().add_element_user(GETULTIMOVALORVORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getUltimoValorVOResponse(@https://was-p/wssgs/services/FachadaWSSGS).
     *
     * This is a complex type.
     */
    public static class GetUltimoValorVOResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetUltimoValorVOResponseDocument.GetUltimoValorVOResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetUltimoValorVOResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETULTIMOVALORVORETURN$0 = 
            new javax.xml.namespace.QName("", "getUltimoValorVOReturn");
        
        
        /**
         * Gets the "getUltimoValorVOReturn" element
         */
        public br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO getGetUltimoValorVOReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO target = null;
                target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO)get_store().find_element_user(GETULTIMOVALORVORETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "getUltimoValorVOReturn" element
         */
        public boolean isNilGetUltimoValorVOReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO target = null;
                target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO)get_store().find_element_user(GETULTIMOVALORVORETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "getUltimoValorVOReturn" element
         */
        public void setGetUltimoValorVOReturn(br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO getUltimoValorVOReturn)
        {
            generatedSetterHelperImpl(getUltimoValorVOReturn, GETULTIMOVALORVORETURN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "getUltimoValorVOReturn" element
         */
        public br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO addNewGetUltimoValorVOReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO target = null;
                target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO)get_store().add_element_user(GETULTIMOVALORVORETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "getUltimoValorVOReturn" element
         */
        public void setNilGetUltimoValorVOReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO target = null;
                target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO)get_store().find_element_user(GETULTIMOVALORVORETURN$0, 0);
                if (target == null)
                {
                    target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO)get_store().add_element_user(GETULTIMOVALORVORETURN$0);
                }
                target.setNil();
            }
        }
    }
}
