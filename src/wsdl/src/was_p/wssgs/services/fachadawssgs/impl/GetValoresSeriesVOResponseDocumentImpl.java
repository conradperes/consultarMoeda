/*
 * An XML document type.
 * Localname: getValoresSeriesVOResponse
 * Namespace: https://was-p/wssgs/services/FachadaWSSGS
 * Java type: was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument
 *
 * Automatically generated - do not modify.
 */
package was_p.wssgs.services.fachadawssgs.impl;
/**
 * A document containing one getValoresSeriesVOResponse(@https://was-p/wssgs/services/FachadaWSSGS) element.
 *
 * This is a complex type.
 */
public class GetValoresSeriesVOResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetValoresSeriesVOResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVALORESSERIESVORESPONSE$0 = 
        new javax.xml.namespace.QName("https://was-p/wssgs/services/FachadaWSSGS", "getValoresSeriesVOResponse");
    
    
    /**
     * Gets the "getValoresSeriesVOResponse" element
     */
    public was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument.GetValoresSeriesVOResponse getGetValoresSeriesVOResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument.GetValoresSeriesVOResponse target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument.GetValoresSeriesVOResponse)get_store().find_element_user(GETVALORESSERIESVORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getValoresSeriesVOResponse" element
     */
    public void setGetValoresSeriesVOResponse(was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument.GetValoresSeriesVOResponse getValoresSeriesVOResponse)
    {
        generatedSetterHelperImpl(getValoresSeriesVOResponse, GETVALORESSERIESVORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getValoresSeriesVOResponse" element
     */
    public was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument.GetValoresSeriesVOResponse addNewGetValoresSeriesVOResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument.GetValoresSeriesVOResponse target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument.GetValoresSeriesVOResponse)get_store().add_element_user(GETVALORESSERIESVORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getValoresSeriesVOResponse(@https://was-p/wssgs/services/FachadaWSSGS).
     *
     * This is a complex type.
     */
    public static class GetValoresSeriesVOResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument.GetValoresSeriesVOResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetValoresSeriesVOResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETVALORESSERIESVORETURN$0 = 
            new javax.xml.namespace.QName("", "getValoresSeriesVOReturn");
        
        
        /**
         * Gets the "getValoresSeriesVOReturn" element
         */
        public br.gov.bcb.pec.sgs.casosdeuso.ws.comum.ArrayOffWSSerieVO getGetValoresSeriesVOReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.gov.bcb.pec.sgs.casosdeuso.ws.comum.ArrayOffWSSerieVO target = null;
                target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.ArrayOffWSSerieVO)get_store().find_element_user(GETVALORESSERIESVORETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "getValoresSeriesVOReturn" element
         */
        public boolean isNilGetValoresSeriesVOReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.gov.bcb.pec.sgs.casosdeuso.ws.comum.ArrayOffWSSerieVO target = null;
                target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.ArrayOffWSSerieVO)get_store().find_element_user(GETVALORESSERIESVORETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "getValoresSeriesVOReturn" element
         */
        public void setGetValoresSeriesVOReturn(br.gov.bcb.pec.sgs.casosdeuso.ws.comum.ArrayOffWSSerieVO getValoresSeriesVOReturn)
        {
            generatedSetterHelperImpl(getValoresSeriesVOReturn, GETVALORESSERIESVORETURN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "getValoresSeriesVOReturn" element
         */
        public br.gov.bcb.pec.sgs.casosdeuso.ws.comum.ArrayOffWSSerieVO addNewGetValoresSeriesVOReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.gov.bcb.pec.sgs.casosdeuso.ws.comum.ArrayOffWSSerieVO target = null;
                target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.ArrayOffWSSerieVO)get_store().add_element_user(GETVALORESSERIESVORETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "getValoresSeriesVOReturn" element
         */
        public void setNilGetValoresSeriesVOReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.gov.bcb.pec.sgs.casosdeuso.ws.comum.ArrayOffWSSerieVO target = null;
                target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.ArrayOffWSSerieVO)get_store().find_element_user(GETVALORESSERIESVORETURN$0, 0);
                if (target == null)
                {
                    target = (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.ArrayOffWSSerieVO)get_store().add_element_user(GETVALORESSERIESVORETURN$0);
                }
                target.setNil();
            }
        }
    }
}
