
package com.etudiant;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.etudiant package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WsSemestreIdsem_QNAME = new QName("studyapp.wsmodels", "idsem");
    private final static QName _ModificationResponse_QNAME = new QName("etudiantService", "modificationResponse");
    private final static QName _GetAllModulesResponse_QNAME = new QName("etudiantService", "get_all_modulesResponse");
    private final static QName _GetSituationPedagoResponse_QNAME = new QName("etudiantService", "get_situation_pedagoResponse");
    private final static QName _GetEtudiant_QNAME = new QName("etudiantService", "get_etudiant");
    private final static QName _GetProfesseursActuels_QNAME = new QName("etudiantService", "get_professeurs_actuels");
    private final static QName _GetAllInscriptions_QNAME = new QName("etudiantService", "get_all_inscriptions");
    private final static QName _GetAllSemestres_QNAME = new QName("etudiantService", "get_all_semestres");
    private final static QName _WsInscription_QNAME = new QName("studyapp.wsmodels", "WsInscription");
    private final static QName _GetEtudiantResponse_QNAME = new QName("etudiantService", "get_etudiantResponse");
    private final static QName _GetAllProfesseurs_QNAME = new QName("etudiantService", "get_all_professeurs");
    private final static QName _WsEtudiantArray_QNAME = new QName("studyapp.wsmodels", "WsEtudiantArray");
    private final static QName _WsProfesseurArray_QNAME = new QName("studyapp.wsmodels", "WsProfesseurArray");
    private final static QName _WsEtudiant_QNAME = new QName("studyapp.wsmodels", "WsEtudiant");
    private final static QName _ShowsDevloppersResponse_QNAME = new QName("etudiantService", "showsDevloppersResponse");
    private final static QName _GetActualInscriptions_QNAME = new QName("etudiantService", "get_actual_inscriptions");
    private final static QName _GetAllEtudiantsResponse_QNAME = new QName("etudiantService", "get_all_etudiantsResponse");
    private final static QName _GetAllProfesseursResponse_QNAME = new QName("etudiantService", "get_all_professeursResponse");
    private final static QName _WsSemestreArray_QNAME = new QName("studyapp.wsmodels", "WsSemestreArray");
    private final static QName _StringArray_QNAME = new QName("etudiantService", "stringArray");
    private final static QName _WsInscriptionArray_QNAME = new QName("studyapp.wsmodels", "WsInscriptionArray");
    private final static QName _GetActualInscriptionsResponse_QNAME = new QName("etudiantService", "get_actual_inscriptionsResponse");
    private final static QName _GetSituationPedago_QNAME = new QName("etudiantService", "get_situation_pedago");
    private final static QName _GetAllSemestresResponse_QNAME = new QName("etudiantService", "get_all_semestresResponse");
    private final static QName _WsModuleArray_QNAME = new QName("studyapp.wsmodels", "WsModuleArray");
    private final static QName _ShowsDevloppers_QNAME = new QName("etudiantService", "showsDevloppers");
    private final static QName _GetAllModules_QNAME = new QName("etudiantService", "get_all_modules");
    private final static QName _GetAllInscriptionsResponse_QNAME = new QName("etudiantService", "get_all_inscriptionsResponse");
    private final static QName _GetAllEtudiants_QNAME = new QName("etudiantService", "get_all_etudiants");
    private final static QName _GetProfesseursActuelsResponse_QNAME = new QName("etudiantService", "get_professeurs_actuelsResponse");
    private final static QName _Modification_QNAME = new QName("etudiantService", "modification");
    private final static QName _WsProfesseur_QNAME = new QName("studyapp.wsmodels", "WsProfesseur");
    private final static QName _WsSemestre_QNAME = new QName("studyapp.wsmodels", "WsSemestre");
    private final static QName _WsModule_QNAME = new QName("studyapp.wsmodels", "WsModule");
    private final static QName _ModificationVals_QNAME = new QName("etudiantService", "vals");
    private final static QName _ModificationKeys_QNAME = new QName("etudiantService", "keys");
    private final static QName _WsModuleIdm_QNAME = new QName("studyapp.wsmodels", "idm");
    private final static QName _WsModuleNom_QNAME = new QName("studyapp.wsmodels", "nom");
    private final static QName _WsModuleIdmEq_QNAME = new QName("studyapp.wsmodels", "idm_eq");
    private final static QName _WsModuleDescription_QNAME = new QName("studyapp.wsmodels", "description");
    private final static QName _WsModuleSemestre_QNAME = new QName("studyapp.wsmodels", "semestre");
    private final static QName _WsModuleProf_QNAME = new QName("studyapp.wsmodels", "prof");
    private final static QName _GetAllSemestresResponseGetAllSemestresResult_QNAME = new QName("etudiantService", "get_all_semestresResult");
    private final static QName _ModificationResponseModificationResult_QNAME = new QName("etudiantService", "modificationResult");
    private final static QName _GetActualInscriptionsPasswd_QNAME = new QName("etudiantService", "passwd");
    private final static QName _GetActualInscriptionsCneE_QNAME = new QName("etudiantService", "cne_e");
    private final static QName _GetAllInscriptionsResponseGetAllInscriptionsResult_QNAME = new QName("etudiantService", "get_all_inscriptionsResult");
    private final static QName _GetAllEtudiantsResponseGetAllEtudiantsResult_QNAME = new QName("etudiantService", "get_all_etudiantsResult");
    private final static QName _ShowsDevloppersResponseShowsDevloppersResult_QNAME = new QName("etudiantService", "showsDevloppersResult");
    private final static QName _WsEtudiantTelephone_QNAME = new QName("studyapp.wsmodels", "telephone");
    private final static QName _WsEtudiantCin_QNAME = new QName("studyapp.wsmodels", "cin");
    private final static QName _WsEtudiantDateAjt_QNAME = new QName("studyapp.wsmodels", "date_ajt");
    private final static QName _WsEtudiantOrderAdmis_QNAME = new QName("studyapp.wsmodels", "orderAdmis");
    private final static QName _WsEtudiantEmail_QNAME = new QName("studyapp.wsmodels", "email");
    private final static QName _WsEtudiantCne_QNAME = new QName("studyapp.wsmodels", "cne");
    private final static QName _WsEtudiantPrenom_QNAME = new QName("studyapp.wsmodels", "prenom");
    private final static QName _WsEtudiantMdp_QNAME = new QName("studyapp.wsmodels", "mdp");
    private final static QName _WsEtudiantTypeLicence_QNAME = new QName("studyapp.wsmodels", "typeLicence");
    private final static QName _WsEtudiantDdn_QNAME = new QName("studyapp.wsmodels", "ddn");
    private final static QName _WsEtudiantNumInscription_QNAME = new QName("studyapp.wsmodels", "num_inscription");
    private final static QName _WsEtudiantAdresse_QNAME = new QName("studyapp.wsmodels", "adresse");
    private final static QName _WsEtudiantAnneUniver_QNAME = new QName("studyapp.wsmodels", "anneUniver");
    private final static QName _GetAllProfesseursResponseGetAllProfesseursResult_QNAME = new QName("etudiantService", "get_all_professeursResult");
    private final static QName _GetEtudiantResponseGetEtudiantResult_QNAME = new QName("etudiantService", "get_etudiantResult");
    private final static QName _GetSituationPedagoResponseGetSituationPedagoResult_QNAME = new QName("etudiantService", "get_situation_pedagoResult");
    private final static QName _GetProfesseursActuelsResponseGetProfesseursActuelsResult_QNAME = new QName("etudiantService", "get_professeurs_actuelsResult");
    private final static QName _GetActualInscriptionsResponseGetActualInscriptionsResult_QNAME = new QName("etudiantService", "get_actual_inscriptionsResult");
    private final static QName _GetAllModulesResponseGetAllModulesResult_QNAME = new QName("etudiantService", "get_all_modulesResult");
    private final static QName _WsProfesseurCodeEmboche_QNAME = new QName("studyapp.wsmodels", "code_emboche");
    private final static QName _WsInscriptionProfNom_QNAME = new QName("studyapp.wsmodels", "prof_nom");
    private final static QName _WsInscriptionCneEtudiant_QNAME = new QName("studyapp.wsmodels", "cne_etudiant");
    private final static QName _WsInscriptionNoteR_QNAME = new QName("studyapp.wsmodels", "noteR");
    private final static QName _WsInscriptionNomModule_QNAME = new QName("studyapp.wsmodels", "nom_module");
    private final static QName _WsInscriptionNbInscrit_QNAME = new QName("studyapp.wsmodels", "nb_inscrit");
    private final static QName _WsInscriptionNoteN_QNAME = new QName("studyapp.wsmodels", "noteN");
    private final static QName _WsInscriptionIdM_QNAME = new QName("studyapp.wsmodels", "id_m");
    private final static QName _WsInscriptionProfPrenom_QNAME = new QName("studyapp.wsmodels", "prof_prenom");
    private final static QName _WsInscriptionDescriptionProf_QNAME = new QName("studyapp.wsmodels", "description_prof");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.etudiant
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WsSemestreArray }
     * 
     */
    public WsSemestreArray createWsSemestreArray() {
        return new WsSemestreArray();
    }

    /**
     * Create an instance of {@link WsModuleArray }
     * 
     */
    public WsModuleArray createWsModuleArray() {
        return new WsModuleArray();
    }

    /**
     * Create an instance of {@link WsModule }
     * 
     */
    public WsModule createWsModule() {
        return new WsModule();
    }

    /**
     * Create an instance of {@link WsSemestre }
     * 
     */
    public WsSemestre createWsSemestre() {
        return new WsSemestre();
    }

    /**
     * Create an instance of {@link WsProfesseurArray }
     * 
     */
    public WsProfesseurArray createWsProfesseurArray() {
        return new WsProfesseurArray();
    }

    /**
     * Create an instance of {@link WsProfesseur }
     * 
     */
    public WsProfesseur createWsProfesseur() {
        return new WsProfesseur();
    }

    /**
     * Create an instance of {@link WsEtudiantArray }
     * 
     */
    public WsEtudiantArray createWsEtudiantArray() {
        return new WsEtudiantArray();
    }

    /**
     * Create an instance of {@link WsEtudiant }
     * 
     */
    public WsEtudiant createWsEtudiant() {
        return new WsEtudiant();
    }

    /**
     * Create an instance of {@link WsInscriptionArray }
     * 
     */
    public WsInscriptionArray createWsInscriptionArray() {
        return new WsInscriptionArray();
    }

    /**
     * Create an instance of {@link WsInscription }
     * 
     */
    public WsInscription createWsInscription() {
        return new WsInscription();
    }

    /**
     * Create an instance of {@link GetActualInscriptionsResponse }
     * 
     */
    public GetActualInscriptionsResponse createGetActualInscriptionsResponse() {
        return new GetActualInscriptionsResponse();
    }

    /**
     * Create an instance of {@link GetAllProfesseurs }
     * 
     */
    public GetAllProfesseurs createGetAllProfesseurs() {
        return new GetAllProfesseurs();
    }

    /**
     * Create an instance of {@link GetSituationPedago }
     * 
     */
    public GetSituationPedago createGetSituationPedago() {
        return new GetSituationPedago();
    }

    /**
     * Create an instance of {@link GetAllSemestresResponse }
     * 
     */
    public GetAllSemestresResponse createGetAllSemestresResponse() {
        return new GetAllSemestresResponse();
    }

    /**
     * Create an instance of {@link ModificationResponse }
     * 
     */
    public ModificationResponse createModificationResponse() {
        return new ModificationResponse();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link GetAllModulesResponse }
     * 
     */
    public GetAllModulesResponse createGetAllModulesResponse() {
        return new GetAllModulesResponse();
    }

    /**
     * Create an instance of {@link GetEtudiantResponse }
     * 
     */
    public GetEtudiantResponse createGetEtudiantResponse() {
        return new GetEtudiantResponse();
    }

    /**
     * Create an instance of {@link GetSituationPedagoResponse }
     * 
     */
    public GetSituationPedagoResponse createGetSituationPedagoResponse() {
        return new GetSituationPedagoResponse();
    }

    /**
     * Create an instance of {@link GetEtudiant }
     * 
     */
    public GetEtudiant createGetEtudiant() {
        return new GetEtudiant();
    }

    /**
     * Create an instance of {@link GetProfesseursActuels }
     * 
     */
    public GetProfesseursActuels createGetProfesseursActuels() {
        return new GetProfesseursActuels();
    }

    /**
     * Create an instance of {@link GetAllInscriptions }
     * 
     */
    public GetAllInscriptions createGetAllInscriptions() {
        return new GetAllInscriptions();
    }

    /**
     * Create an instance of {@link GetAllSemestres }
     * 
     */
    public GetAllSemestres createGetAllSemestres() {
        return new GetAllSemestres();
    }

    /**
     * Create an instance of {@link Modification }
     * 
     */
    public Modification createModification() {
        return new Modification();
    }

    /**
     * Create an instance of {@link GetAllEtudiantsResponse }
     * 
     */
    public GetAllEtudiantsResponse createGetAllEtudiantsResponse() {
        return new GetAllEtudiantsResponse();
    }

    /**
     * Create an instance of {@link GetAllProfesseursResponse }
     * 
     */
    public GetAllProfesseursResponse createGetAllProfesseursResponse() {
        return new GetAllProfesseursResponse();
    }

    /**
     * Create an instance of {@link ShowsDevloppersResponse }
     * 
     */
    public ShowsDevloppersResponse createShowsDevloppersResponse() {
        return new ShowsDevloppersResponse();
    }

    /**
     * Create an instance of {@link GetAllInscriptionsResponse }
     * 
     */
    public GetAllInscriptionsResponse createGetAllInscriptionsResponse() {
        return new GetAllInscriptionsResponse();
    }

    /**
     * Create an instance of {@link GetAllModules }
     * 
     */
    public GetAllModules createGetAllModules() {
        return new GetAllModules();
    }

    /**
     * Create an instance of {@link GetActualInscriptions }
     * 
     */
    public GetActualInscriptions createGetActualInscriptions() {
        return new GetActualInscriptions();
    }

    /**
     * Create an instance of {@link ShowsDevloppers }
     * 
     */
    public ShowsDevloppers createShowsDevloppers() {
        return new ShowsDevloppers();
    }

    /**
     * Create an instance of {@link GetProfesseursActuelsResponse }
     * 
     */
    public GetProfesseursActuelsResponse createGetProfesseursActuelsResponse() {
        return new GetProfesseursActuelsResponse();
    }

    /**
     * Create an instance of {@link GetAllEtudiants }
     * 
     */
    public GetAllEtudiants createGetAllEtudiants() {
        return new GetAllEtudiants();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "idsem", scope = WsSemestre.class)
    public JAXBElement<String> createWsSemestreIdsem(String value) {
        return new JAXBElement<String>(_WsSemestreIdsem_QNAME, String.class, WsSemestre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "modificationResponse")
    public JAXBElement<ModificationResponse> createModificationResponse(ModificationResponse value) {
        return new JAXBElement<ModificationResponse>(_ModificationResponse_QNAME, ModificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllModulesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_all_modulesResponse")
    public JAXBElement<GetAllModulesResponse> createGetAllModulesResponse(GetAllModulesResponse value) {
        return new JAXBElement<GetAllModulesResponse>(_GetAllModulesResponse_QNAME, GetAllModulesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSituationPedagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_situation_pedagoResponse")
    public JAXBElement<GetSituationPedagoResponse> createGetSituationPedagoResponse(GetSituationPedagoResponse value) {
        return new JAXBElement<GetSituationPedagoResponse>(_GetSituationPedagoResponse_QNAME, GetSituationPedagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_etudiant")
    public JAXBElement<GetEtudiant> createGetEtudiant(GetEtudiant value) {
        return new JAXBElement<GetEtudiant>(_GetEtudiant_QNAME, GetEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfesseursActuels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_professeurs_actuels")
    public JAXBElement<GetProfesseursActuels> createGetProfesseursActuels(GetProfesseursActuels value) {
        return new JAXBElement<GetProfesseursActuels>(_GetProfesseursActuels_QNAME, GetProfesseursActuels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllInscriptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_all_inscriptions")
    public JAXBElement<GetAllInscriptions> createGetAllInscriptions(GetAllInscriptions value) {
        return new JAXBElement<GetAllInscriptions>(_GetAllInscriptions_QNAME, GetAllInscriptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSemestres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_all_semestres")
    public JAXBElement<GetAllSemestres> createGetAllSemestres(GetAllSemestres value) {
        return new JAXBElement<GetAllSemestres>(_GetAllSemestres_QNAME, GetAllSemestres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsInscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "WsInscription")
    public JAXBElement<WsInscription> createWsInscription(WsInscription value) {
        return new JAXBElement<WsInscription>(_WsInscription_QNAME, WsInscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_etudiantResponse")
    public JAXBElement<GetEtudiantResponse> createGetEtudiantResponse(GetEtudiantResponse value) {
        return new JAXBElement<GetEtudiantResponse>(_GetEtudiantResponse_QNAME, GetEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProfesseurs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_all_professeurs")
    public JAXBElement<GetAllProfesseurs> createGetAllProfesseurs(GetAllProfesseurs value) {
        return new JAXBElement<GetAllProfesseurs>(_GetAllProfesseurs_QNAME, GetAllProfesseurs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsEtudiantArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "WsEtudiantArray")
    public JAXBElement<WsEtudiantArray> createWsEtudiantArray(WsEtudiantArray value) {
        return new JAXBElement<WsEtudiantArray>(_WsEtudiantArray_QNAME, WsEtudiantArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsProfesseurArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "WsProfesseurArray")
    public JAXBElement<WsProfesseurArray> createWsProfesseurArray(WsProfesseurArray value) {
        return new JAXBElement<WsProfesseurArray>(_WsProfesseurArray_QNAME, WsProfesseurArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "WsEtudiant")
    public JAXBElement<WsEtudiant> createWsEtudiant(WsEtudiant value) {
        return new JAXBElement<WsEtudiant>(_WsEtudiant_QNAME, WsEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowsDevloppersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "showsDevloppersResponse")
    public JAXBElement<ShowsDevloppersResponse> createShowsDevloppersResponse(ShowsDevloppersResponse value) {
        return new JAXBElement<ShowsDevloppersResponse>(_ShowsDevloppersResponse_QNAME, ShowsDevloppersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActualInscriptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_actual_inscriptions")
    public JAXBElement<GetActualInscriptions> createGetActualInscriptions(GetActualInscriptions value) {
        return new JAXBElement<GetActualInscriptions>(_GetActualInscriptions_QNAME, GetActualInscriptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEtudiantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_all_etudiantsResponse")
    public JAXBElement<GetAllEtudiantsResponse> createGetAllEtudiantsResponse(GetAllEtudiantsResponse value) {
        return new JAXBElement<GetAllEtudiantsResponse>(_GetAllEtudiantsResponse_QNAME, GetAllEtudiantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProfesseursResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_all_professeursResponse")
    public JAXBElement<GetAllProfesseursResponse> createGetAllProfesseursResponse(GetAllProfesseursResponse value) {
        return new JAXBElement<GetAllProfesseursResponse>(_GetAllProfesseursResponse_QNAME, GetAllProfesseursResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSemestreArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "WsSemestreArray")
    public JAXBElement<WsSemestreArray> createWsSemestreArray(WsSemestreArray value) {
        return new JAXBElement<WsSemestreArray>(_WsSemestreArray_QNAME, WsSemestreArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "stringArray")
    public JAXBElement<StringArray> createStringArray(StringArray value) {
        return new JAXBElement<StringArray>(_StringArray_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsInscriptionArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "WsInscriptionArray")
    public JAXBElement<WsInscriptionArray> createWsInscriptionArray(WsInscriptionArray value) {
        return new JAXBElement<WsInscriptionArray>(_WsInscriptionArray_QNAME, WsInscriptionArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActualInscriptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_actual_inscriptionsResponse")
    public JAXBElement<GetActualInscriptionsResponse> createGetActualInscriptionsResponse(GetActualInscriptionsResponse value) {
        return new JAXBElement<GetActualInscriptionsResponse>(_GetActualInscriptionsResponse_QNAME, GetActualInscriptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSituationPedago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_situation_pedago")
    public JAXBElement<GetSituationPedago> createGetSituationPedago(GetSituationPedago value) {
        return new JAXBElement<GetSituationPedago>(_GetSituationPedago_QNAME, GetSituationPedago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSemestresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_all_semestresResponse")
    public JAXBElement<GetAllSemestresResponse> createGetAllSemestresResponse(GetAllSemestresResponse value) {
        return new JAXBElement<GetAllSemestresResponse>(_GetAllSemestresResponse_QNAME, GetAllSemestresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsModuleArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "WsModuleArray")
    public JAXBElement<WsModuleArray> createWsModuleArray(WsModuleArray value) {
        return new JAXBElement<WsModuleArray>(_WsModuleArray_QNAME, WsModuleArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowsDevloppers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "showsDevloppers")
    public JAXBElement<ShowsDevloppers> createShowsDevloppers(ShowsDevloppers value) {
        return new JAXBElement<ShowsDevloppers>(_ShowsDevloppers_QNAME, ShowsDevloppers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllModules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_all_modules")
    public JAXBElement<GetAllModules> createGetAllModules(GetAllModules value) {
        return new JAXBElement<GetAllModules>(_GetAllModules_QNAME, GetAllModules.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllInscriptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_all_inscriptionsResponse")
    public JAXBElement<GetAllInscriptionsResponse> createGetAllInscriptionsResponse(GetAllInscriptionsResponse value) {
        return new JAXBElement<GetAllInscriptionsResponse>(_GetAllInscriptionsResponse_QNAME, GetAllInscriptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEtudiants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_all_etudiants")
    public JAXBElement<GetAllEtudiants> createGetAllEtudiants(GetAllEtudiants value) {
        return new JAXBElement<GetAllEtudiants>(_GetAllEtudiants_QNAME, GetAllEtudiants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfesseursActuelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_professeurs_actuelsResponse")
    public JAXBElement<GetProfesseursActuelsResponse> createGetProfesseursActuelsResponse(GetProfesseursActuelsResponse value) {
        return new JAXBElement<GetProfesseursActuelsResponse>(_GetProfesseursActuelsResponse_QNAME, GetProfesseursActuelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "modification")
    public JAXBElement<Modification> createModification(Modification value) {
        return new JAXBElement<Modification>(_Modification_QNAME, Modification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsProfesseur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "WsProfesseur")
    public JAXBElement<WsProfesseur> createWsProfesseur(WsProfesseur value) {
        return new JAXBElement<WsProfesseur>(_WsProfesseur_QNAME, WsProfesseur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSemestre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "WsSemestre")
    public JAXBElement<WsSemestre> createWsSemestre(WsSemestre value) {
        return new JAXBElement<WsSemestre>(_WsSemestre_QNAME, WsSemestre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsModule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "WsModule")
    public JAXBElement<WsModule> createWsModule(WsModule value) {
        return new JAXBElement<WsModule>(_WsModule_QNAME, WsModule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "vals", scope = Modification.class)
    public JAXBElement<StringArray> createModificationVals(StringArray value) {
        return new JAXBElement<StringArray>(_ModificationVals_QNAME, StringArray.class, Modification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "keys", scope = Modification.class)
    public JAXBElement<StringArray> createModificationKeys(StringArray value) {
        return new JAXBElement<StringArray>(_ModificationKeys_QNAME, StringArray.class, Modification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "idm", scope = WsModule.class)
    public JAXBElement<String> createWsModuleIdm(String value) {
        return new JAXBElement<String>(_WsModuleIdm_QNAME, String.class, WsModule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "nom", scope = WsModule.class)
    public JAXBElement<String> createWsModuleNom(String value) {
        return new JAXBElement<String>(_WsModuleNom_QNAME, String.class, WsModule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "idm_eq", scope = WsModule.class)
    public JAXBElement<String> createWsModuleIdmEq(String value) {
        return new JAXBElement<String>(_WsModuleIdmEq_QNAME, String.class, WsModule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "description", scope = WsModule.class)
    public JAXBElement<String> createWsModuleDescription(String value) {
        return new JAXBElement<String>(_WsModuleDescription_QNAME, String.class, WsModule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "semestre", scope = WsModule.class)
    public JAXBElement<String> createWsModuleSemestre(String value) {
        return new JAXBElement<String>(_WsModuleSemestre_QNAME, String.class, WsModule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsProfesseur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "prof", scope = WsModule.class)
    public JAXBElement<WsProfesseur> createWsModuleProf(WsProfesseur value) {
        return new JAXBElement<WsProfesseur>(_WsModuleProf_QNAME, WsProfesseur.class, WsModule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSemestreArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_all_semestresResult", scope = GetAllSemestresResponse.class)
    public JAXBElement<WsSemestreArray> createGetAllSemestresResponseGetAllSemestresResult(WsSemestreArray value) {
        return new JAXBElement<WsSemestreArray>(_GetAllSemestresResponseGetAllSemestresResult_QNAME, WsSemestreArray.class, GetAllSemestresResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "modificationResult", scope = ModificationResponse.class)
    public JAXBElement<WsEtudiant> createModificationResponseModificationResult(WsEtudiant value) {
        return new JAXBElement<WsEtudiant>(_ModificationResponseModificationResult_QNAME, WsEtudiant.class, ModificationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "passwd", scope = GetActualInscriptions.class)
    public JAXBElement<String> createGetActualInscriptionsPasswd(String value) {
        return new JAXBElement<String>(_GetActualInscriptionsPasswd_QNAME, String.class, GetActualInscriptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "cne_e", scope = GetActualInscriptions.class)
    public JAXBElement<String> createGetActualInscriptionsCneE(String value) {
        return new JAXBElement<String>(_GetActualInscriptionsCneE_QNAME, String.class, GetActualInscriptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsInscriptionArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_all_inscriptionsResult", scope = GetAllInscriptionsResponse.class)
    public JAXBElement<WsInscriptionArray> createGetAllInscriptionsResponseGetAllInscriptionsResult(WsInscriptionArray value) {
        return new JAXBElement<WsInscriptionArray>(_GetAllInscriptionsResponseGetAllInscriptionsResult_QNAME, WsInscriptionArray.class, GetAllInscriptionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsEtudiantArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_all_etudiantsResult", scope = GetAllEtudiantsResponse.class)
    public JAXBElement<WsEtudiantArray> createGetAllEtudiantsResponseGetAllEtudiantsResult(WsEtudiantArray value) {
        return new JAXBElement<WsEtudiantArray>(_GetAllEtudiantsResponseGetAllEtudiantsResult_QNAME, WsEtudiantArray.class, GetAllEtudiantsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "showsDevloppersResult", scope = ShowsDevloppersResponse.class)
    public JAXBElement<StringArray> createShowsDevloppersResponseShowsDevloppersResult(StringArray value) {
        return new JAXBElement<StringArray>(_ShowsDevloppersResponseShowsDevloppersResult_QNAME, StringArray.class, ShowsDevloppersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "telephone", scope = WsEtudiant.class)
    public JAXBElement<String> createWsEtudiantTelephone(String value) {
        return new JAXBElement<String>(_WsEtudiantTelephone_QNAME, String.class, WsEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "cin", scope = WsEtudiant.class)
    public JAXBElement<String> createWsEtudiantCin(String value) {
        return new JAXBElement<String>(_WsEtudiantCin_QNAME, String.class, WsEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "date_ajt", scope = WsEtudiant.class)
    public JAXBElement<String> createWsEtudiantDateAjt(String value) {
        return new JAXBElement<String>(_WsEtudiantDateAjt_QNAME, String.class, WsEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "orderAdmis", scope = WsEtudiant.class)
    public JAXBElement<BigInteger> createWsEtudiantOrderAdmis(BigInteger value) {
        return new JAXBElement<BigInteger>(_WsEtudiantOrderAdmis_QNAME, BigInteger.class, WsEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "email", scope = WsEtudiant.class)
    public JAXBElement<String> createWsEtudiantEmail(String value) {
        return new JAXBElement<String>(_WsEtudiantEmail_QNAME, String.class, WsEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "cne", scope = WsEtudiant.class)
    public JAXBElement<BigInteger> createWsEtudiantCne(BigInteger value) {
        return new JAXBElement<BigInteger>(_WsEtudiantCne_QNAME, BigInteger.class, WsEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "description", scope = WsEtudiant.class)
    public JAXBElement<String> createWsEtudiantDescription(String value) {
        return new JAXBElement<String>(_WsModuleDescription_QNAME, String.class, WsEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "prenom", scope = WsEtudiant.class)
    public JAXBElement<String> createWsEtudiantPrenom(String value) {
        return new JAXBElement<String>(_WsEtudiantPrenom_QNAME, String.class, WsEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "mdp", scope = WsEtudiant.class)
    public JAXBElement<String> createWsEtudiantMdp(String value) {
        return new JAXBElement<String>(_WsEtudiantMdp_QNAME, String.class, WsEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "typeLicence", scope = WsEtudiant.class)
    public JAXBElement<String> createWsEtudiantTypeLicence(String value) {
        return new JAXBElement<String>(_WsEtudiantTypeLicence_QNAME, String.class, WsEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "nom", scope = WsEtudiant.class)
    public JAXBElement<String> createWsEtudiantNom(String value) {
        return new JAXBElement<String>(_WsModuleNom_QNAME, String.class, WsEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "ddn", scope = WsEtudiant.class)
    public JAXBElement<String> createWsEtudiantDdn(String value) {
        return new JAXBElement<String>(_WsEtudiantDdn_QNAME, String.class, WsEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "num_inscription", scope = WsEtudiant.class)
    public JAXBElement<BigInteger> createWsEtudiantNumInscription(BigInteger value) {
        return new JAXBElement<BigInteger>(_WsEtudiantNumInscription_QNAME, BigInteger.class, WsEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "adresse", scope = WsEtudiant.class)
    public JAXBElement<String> createWsEtudiantAdresse(String value) {
        return new JAXBElement<String>(_WsEtudiantAdresse_QNAME, String.class, WsEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "anneUniver", scope = WsEtudiant.class)
    public JAXBElement<String> createWsEtudiantAnneUniver(String value) {
        return new JAXBElement<String>(_WsEtudiantAnneUniver_QNAME, String.class, WsEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "passwd", scope = GetEtudiant.class)
    public JAXBElement<String> createGetEtudiantPasswd(String value) {
        return new JAXBElement<String>(_GetActualInscriptionsPasswd_QNAME, String.class, GetEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "cne_e", scope = GetEtudiant.class)
    public JAXBElement<String> createGetEtudiantCneE(String value) {
        return new JAXBElement<String>(_GetActualInscriptionsCneE_QNAME, String.class, GetEtudiant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsProfesseurArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_all_professeursResult", scope = GetAllProfesseursResponse.class)
    public JAXBElement<WsProfesseurArray> createGetAllProfesseursResponseGetAllProfesseursResult(WsProfesseurArray value) {
        return new JAXBElement<WsProfesseurArray>(_GetAllProfesseursResponseGetAllProfesseursResult_QNAME, WsProfesseurArray.class, GetAllProfesseursResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_etudiantResult", scope = GetEtudiantResponse.class)
    public JAXBElement<WsEtudiant> createGetEtudiantResponseGetEtudiantResult(WsEtudiant value) {
        return new JAXBElement<WsEtudiant>(_GetEtudiantResponseGetEtudiantResult_QNAME, WsEtudiant.class, GetEtudiantResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "passwd", scope = GetSituationPedago.class)
    public JAXBElement<String> createGetSituationPedagoPasswd(String value) {
        return new JAXBElement<String>(_GetActualInscriptionsPasswd_QNAME, String.class, GetSituationPedago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "cne_e", scope = GetSituationPedago.class)
    public JAXBElement<String> createGetSituationPedagoCneE(String value) {
        return new JAXBElement<String>(_GetActualInscriptionsCneE_QNAME, String.class, GetSituationPedago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsInscriptionArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_situation_pedagoResult", scope = GetSituationPedagoResponse.class)
    public JAXBElement<WsInscriptionArray> createGetSituationPedagoResponseGetSituationPedagoResult(WsInscriptionArray value) {
        return new JAXBElement<WsInscriptionArray>(_GetSituationPedagoResponseGetSituationPedagoResult_QNAME, WsInscriptionArray.class, GetSituationPedagoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsProfesseurArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_professeurs_actuelsResult", scope = GetProfesseursActuelsResponse.class)
    public JAXBElement<WsProfesseurArray> createGetProfesseursActuelsResponseGetProfesseursActuelsResult(WsProfesseurArray value) {
        return new JAXBElement<WsProfesseurArray>(_GetProfesseursActuelsResponseGetProfesseursActuelsResult_QNAME, WsProfesseurArray.class, GetProfesseursActuelsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsInscriptionArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_actual_inscriptionsResult", scope = GetActualInscriptionsResponse.class)
    public JAXBElement<WsInscriptionArray> createGetActualInscriptionsResponseGetActualInscriptionsResult(WsInscriptionArray value) {
        return new JAXBElement<WsInscriptionArray>(_GetActualInscriptionsResponseGetActualInscriptionsResult_QNAME, WsInscriptionArray.class, GetActualInscriptionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsModuleArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "get_all_modulesResult", scope = GetAllModulesResponse.class)
    public JAXBElement<WsModuleArray> createGetAllModulesResponseGetAllModulesResult(WsModuleArray value) {
        return new JAXBElement<WsModuleArray>(_GetAllModulesResponseGetAllModulesResult_QNAME, WsModuleArray.class, GetAllModulesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "code_emboche", scope = WsProfesseur.class)
    public JAXBElement<BigInteger> createWsProfesseurCodeEmboche(BigInteger value) {
        return new JAXBElement<BigInteger>(_WsProfesseurCodeEmboche_QNAME, BigInteger.class, WsProfesseur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "telephone", scope = WsProfesseur.class)
    public JAXBElement<String> createWsProfesseurTelephone(String value) {
        return new JAXBElement<String>(_WsEtudiantTelephone_QNAME, String.class, WsProfesseur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "cin", scope = WsProfesseur.class)
    public JAXBElement<String> createWsProfesseurCin(String value) {
        return new JAXBElement<String>(_WsEtudiantCin_QNAME, String.class, WsProfesseur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "ddn", scope = WsProfesseur.class)
    public JAXBElement<String> createWsProfesseurDdn(String value) {
        return new JAXBElement<String>(_WsEtudiantDdn_QNAME, String.class, WsProfesseur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "nom", scope = WsProfesseur.class)
    public JAXBElement<String> createWsProfesseurNom(String value) {
        return new JAXBElement<String>(_WsModuleNom_QNAME, String.class, WsProfesseur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "email", scope = WsProfesseur.class)
    public JAXBElement<String> createWsProfesseurEmail(String value) {
        return new JAXBElement<String>(_WsEtudiantEmail_QNAME, String.class, WsProfesseur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "adresse", scope = WsProfesseur.class)
    public JAXBElement<String> createWsProfesseurAdresse(String value) {
        return new JAXBElement<String>(_WsEtudiantAdresse_QNAME, String.class, WsProfesseur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "description", scope = WsProfesseur.class)
    public JAXBElement<String> createWsProfesseurDescription(String value) {
        return new JAXBElement<String>(_WsModuleDescription_QNAME, String.class, WsProfesseur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "prenom", scope = WsProfesseur.class)
    public JAXBElement<String> createWsProfesseurPrenom(String value) {
        return new JAXBElement<String>(_WsEtudiantPrenom_QNAME, String.class, WsProfesseur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "mdp", scope = WsProfesseur.class)
    public JAXBElement<String> createWsProfesseurMdp(String value) {
        return new JAXBElement<String>(_WsEtudiantMdp_QNAME, String.class, WsProfesseur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "prof_nom", scope = WsInscription.class)
    public JAXBElement<String> createWsInscriptionProfNom(String value) {
        return new JAXBElement<String>(_WsInscriptionProfNom_QNAME, String.class, WsInscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "cne_etudiant", scope = WsInscription.class)
    public JAXBElement<String> createWsInscriptionCneEtudiant(String value) {
        return new JAXBElement<String>(_WsInscriptionCneEtudiant_QNAME, String.class, WsInscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "noteR", scope = WsInscription.class)
    public JAXBElement<BigDecimal> createWsInscriptionNoteR(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_WsInscriptionNoteR_QNAME, BigDecimal.class, WsInscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "nom_module", scope = WsInscription.class)
    public JAXBElement<String> createWsInscriptionNomModule(String value) {
        return new JAXBElement<String>(_WsInscriptionNomModule_QNAME, String.class, WsInscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "nb_inscrit", scope = WsInscription.class)
    public JAXBElement<BigInteger> createWsInscriptionNbInscrit(BigInteger value) {
        return new JAXBElement<BigInteger>(_WsInscriptionNbInscrit_QNAME, BigInteger.class, WsInscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "noteN", scope = WsInscription.class)
    public JAXBElement<BigDecimal> createWsInscriptionNoteN(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_WsInscriptionNoteN_QNAME, BigDecimal.class, WsInscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "id_m", scope = WsInscription.class)
    public JAXBElement<String> createWsInscriptionIdM(String value) {
        return new JAXBElement<String>(_WsInscriptionIdM_QNAME, String.class, WsInscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "anneUniver", scope = WsInscription.class)
    public JAXBElement<String> createWsInscriptionAnneUniver(String value) {
        return new JAXBElement<String>(_WsEtudiantAnneUniver_QNAME, String.class, WsInscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "semestre", scope = WsInscription.class)
    public JAXBElement<String> createWsInscriptionSemestre(String value) {
        return new JAXBElement<String>(_WsModuleSemestre_QNAME, String.class, WsInscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "prof_prenom", scope = WsInscription.class)
    public JAXBElement<String> createWsInscriptionProfPrenom(String value) {
        return new JAXBElement<String>(_WsInscriptionProfPrenom_QNAME, String.class, WsInscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "studyapp.wsmodels", name = "description_prof", scope = WsInscription.class)
    public JAXBElement<String> createWsInscriptionDescriptionProf(String value) {
        return new JAXBElement<String>(_WsInscriptionDescriptionProf_QNAME, String.class, WsInscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "passwd", scope = GetProfesseursActuels.class)
    public JAXBElement<String> createGetProfesseursActuelsPasswd(String value) {
        return new JAXBElement<String>(_GetActualInscriptionsPasswd_QNAME, String.class, GetProfesseursActuels.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "etudiantService", name = "cne_e", scope = GetProfesseursActuels.class)
    public JAXBElement<String> createGetProfesseursActuelsCneE(String value) {
        return new JAXBElement<String>(_GetActualInscriptionsCneE_QNAME, String.class, GetProfesseursActuels.class, value);
    }

}
