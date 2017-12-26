
package br.com.newcorretora.service.geraws.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ProgramInterface complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProgramInterface"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="web_sudwsmsg"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="web_usuario_tmpdir_ususerv"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_pdslib_book"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_reqmem_book_entrada"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_resquest_namespace"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_respmem_book_saida"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_response_namespace"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_lang"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="5"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_pgmname"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_uri"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_pgmint_container_commarea"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_wsbind"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_wsdl"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_wsdl_namespace_http"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_operation_name"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_userid"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_transaction"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_msg_retorno"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_sequencia_controle"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                         &lt;maxInclusive value="999999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="web_submit_status"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramInterface", propOrder = {
    "webSudwsmsg"
})
public class ProgramInterface {

    @XmlElement(name = "web_sudwsmsg", required = true)
    protected ProgramInterface.WebSudwsmsg webSudwsmsg;

    /**
     * Obt�m o valor da propriedade webSudwsmsg.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.WebSudwsmsg }
     *     
     */
    public ProgramInterface.WebSudwsmsg getWebSudwsmsg() {
        return webSudwsmsg;
    }

    /**
     * Define o valor da propriedade webSudwsmsg.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.WebSudwsmsg }
     *     
     */
    public void setWebSudwsmsg(ProgramInterface.WebSudwsmsg value) {
        this.webSudwsmsg = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="web_usuario_tmpdir_ususerv"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="10"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_pdslib_book"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="18"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_reqmem_book_entrada"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_resquest_namespace"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="50"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_respmem_book_saida"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_response_namespace"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="50"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_lang"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="5"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_pgmname"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_uri"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="50"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_pgmint_container_commarea"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="9"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_wsbind"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_wsdl"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_wsdl_namespace_http"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="50"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_operation_name"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="50"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_userid"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_transaction"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="4"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_msg_retorno"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="50"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_sequencia_controle"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *               &lt;maxInclusive value="999999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="web_submit_status"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "webUsuarioTmpdirUsuserv",
        "webPdslibBook",
        "webReqmemBookEntrada",
        "webResquestNamespace",
        "webRespmemBookSaida",
        "webResponseNamespace",
        "webLang",
        "webPgmname",
        "webUri",
        "webPgmintContainerCommarea",
        "webWsbind",
        "webWsdl",
        "webWsdlNamespaceHttp",
        "webOperationName",
        "webUserid",
        "webTransaction",
        "webMsgRetorno",
        "webSequenciaControle",
        "webSubmitStatus"
    })
    public static class WebSudwsmsg {

        @XmlElement(name = "web_usuario_tmpdir_ususerv", required = true)
        protected String webUsuarioTmpdirUsuserv;
        @XmlElement(name = "web_pdslib_book", required = true)
        protected String webPdslibBook;
        @XmlElement(name = "web_reqmem_book_entrada", required = true)
        protected String webReqmemBookEntrada;
        @XmlElement(name = "web_resquest_namespace", required = true)
        protected String webResquestNamespace;
        @XmlElement(name = "web_respmem_book_saida", required = true)
        protected String webRespmemBookSaida;
        @XmlElement(name = "web_response_namespace", required = true)
        protected String webResponseNamespace;
        @XmlElement(name = "web_lang", required = true)
        protected String webLang;
        @XmlElement(name = "web_pgmname", required = true)
        protected String webPgmname;
        @XmlElement(name = "web_uri", required = true)
        protected String webUri;
        @XmlElement(name = "web_pgmint_container_commarea", required = true)
        protected String webPgmintContainerCommarea;
        @XmlElement(name = "web_wsbind", required = true)
        protected String webWsbind;
        @XmlElement(name = "web_wsdl", required = true)
        protected String webWsdl;
        @XmlElement(name = "web_wsdl_namespace_http", required = true)
        protected String webWsdlNamespaceHttp;
        @XmlElement(name = "web_operation_name", required = true)
        protected String webOperationName;
        @XmlElement(name = "web_userid", required = true)
        protected String webUserid;
        @XmlElement(name = "web_transaction", required = true)
        protected String webTransaction;
        @XmlElement(name = "web_msg_retorno", required = true)
        protected String webMsgRetorno;
        @XmlElement(name = "web_sequencia_controle")
        protected long webSequenciaControle;
        @XmlElement(name = "web_submit_status", required = true)
        protected String webSubmitStatus;

        /**
         * Obt�m o valor da propriedade webUsuarioTmpdirUsuserv.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebUsuarioTmpdirUsuserv() {
            return webUsuarioTmpdirUsuserv;
        }

        /**
         * Define o valor da propriedade webUsuarioTmpdirUsuserv.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebUsuarioTmpdirUsuserv(String value) {
            this.webUsuarioTmpdirUsuserv = value;
        }

        /**
         * Obt�m o valor da propriedade webPdslibBook.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebPdslibBook() {
            return webPdslibBook;
        }

        /**
         * Define o valor da propriedade webPdslibBook.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebPdslibBook(String value) {
            this.webPdslibBook = value;
        }

        /**
         * Obt�m o valor da propriedade webReqmemBookEntrada.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebReqmemBookEntrada() {
            return webReqmemBookEntrada;
        }

        /**
         * Define o valor da propriedade webReqmemBookEntrada.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebReqmemBookEntrada(String value) {
            this.webReqmemBookEntrada = value;
        }

        /**
         * Obt�m o valor da propriedade webResquestNamespace.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebResquestNamespace() {
            return webResquestNamespace;
        }

        /**
         * Define o valor da propriedade webResquestNamespace.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebResquestNamespace(String value) {
            this.webResquestNamespace = value;
        }

        /**
         * Obt�m o valor da propriedade webRespmemBookSaida.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebRespmemBookSaida() {
            return webRespmemBookSaida;
        }

        /**
         * Define o valor da propriedade webRespmemBookSaida.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebRespmemBookSaida(String value) {
            this.webRespmemBookSaida = value;
        }

        /**
         * Obt�m o valor da propriedade webResponseNamespace.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebResponseNamespace() {
            return webResponseNamespace;
        }

        /**
         * Define o valor da propriedade webResponseNamespace.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebResponseNamespace(String value) {
            this.webResponseNamespace = value;
        }

        /**
         * Obt�m o valor da propriedade webLang.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebLang() {
            return webLang;
        }

        /**
         * Define o valor da propriedade webLang.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebLang(String value) {
            this.webLang = value;
        }

        /**
         * Obt�m o valor da propriedade webPgmname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebPgmname() {
            return webPgmname;
        }

        /**
         * Define o valor da propriedade webPgmname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebPgmname(String value) {
            this.webPgmname = value;
        }

        /**
         * Obt�m o valor da propriedade webUri.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebUri() {
            return webUri;
        }

        /**
         * Define o valor da propriedade webUri.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebUri(String value) {
            this.webUri = value;
        }

        /**
         * Obt�m o valor da propriedade webPgmintContainerCommarea.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebPgmintContainerCommarea() {
            return webPgmintContainerCommarea;
        }

        /**
         * Define o valor da propriedade webPgmintContainerCommarea.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebPgmintContainerCommarea(String value) {
            this.webPgmintContainerCommarea = value;
        }

        /**
         * Obt�m o valor da propriedade webWsbind.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebWsbind() {
            return webWsbind;
        }

        /**
         * Define o valor da propriedade webWsbind.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebWsbind(String value) {
            this.webWsbind = value;
        }

        /**
         * Obt�m o valor da propriedade webWsdl.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebWsdl() {
            return webWsdl;
        }

        /**
         * Define o valor da propriedade webWsdl.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebWsdl(String value) {
            this.webWsdl = value;
        }

        /**
         * Obt�m o valor da propriedade webWsdlNamespaceHttp.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebWsdlNamespaceHttp() {
            return webWsdlNamespaceHttp;
        }

        /**
         * Define o valor da propriedade webWsdlNamespaceHttp.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebWsdlNamespaceHttp(String value) {
            this.webWsdlNamespaceHttp = value;
        }

        /**
         * Obt�m o valor da propriedade webOperationName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebOperationName() {
            return webOperationName;
        }

        /**
         * Define o valor da propriedade webOperationName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebOperationName(String value) {
            this.webOperationName = value;
        }

        /**
         * Obt�m o valor da propriedade webUserid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebUserid() {
            return webUserid;
        }

        /**
         * Define o valor da propriedade webUserid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebUserid(String value) {
            this.webUserid = value;
        }

        /**
         * Obt�m o valor da propriedade webTransaction.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebTransaction() {
            return webTransaction;
        }

        /**
         * Define o valor da propriedade webTransaction.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebTransaction(String value) {
            this.webTransaction = value;
        }

        /**
         * Obt�m o valor da propriedade webMsgRetorno.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebMsgRetorno() {
            return webMsgRetorno;
        }

        /**
         * Define o valor da propriedade webMsgRetorno.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebMsgRetorno(String value) {
            this.webMsgRetorno = value;
        }

        /**
         * Obt�m o valor da propriedade webSequenciaControle.
         * 
         */
        public long getWebSequenciaControle() {
            return webSequenciaControle;
        }

        /**
         * Define o valor da propriedade webSequenciaControle.
         * 
         */
        public void setWebSequenciaControle(long value) {
            this.webSequenciaControle = value;
        }

        /**
         * Obt�m o valor da propriedade webSubmitStatus.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebSubmitStatus() {
            return webSubmitStatus;
        }

        /**
         * Define o valor da propriedade webSubmitStatus.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebSubmitStatus(String value) {
            this.webSubmitStatus = value;
        }

    }

}
