/**
 * AllegroWebApiPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public interface AllegroWebApiPortType extends java.rmi.Remote {
    public void doGetCatsData(int countryId, long localVersion, java.lang.String webapiKey, pl.net.yuri.magister.soap.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;

    public void doLogin(java.lang.String userLogin, java.lang.String userPassword, int countryCode, java.lang.String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException;

    public void doLoginEnc(java.lang.String userLogin, java.lang.String userHashPassword, int countryCode, java.lang.String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException;

    public void doNewAuction(java.lang.String sessionHandle, pl.net.yuri.magister.soap.FieldsValue[] fields, int _private, int localId, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.StringHolder itemInfo) throws java.rmi.RemoteException;

    public void doNewAuctionExt(java.lang.String sessionHandle, pl.net.yuri.magister.soap.FieldsValue[] fields, int _private, int localId, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.StringHolder itemInfo) throws java.rmi.RemoteException;

    public void doSellSomeAgain(java.lang.String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellAuctionDuration, int sellOptions, pl.net.yuri.magister.soap.holders.ArrayOfStructSellAgainHolder itemsSellAgain, pl.net.yuri.magister.soap.holders.ArrayOfStructSellFailedHolder itemsSellFailed, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException;

    public void doCheckNewAuction(java.lang.String sessionHandle, pl.net.yuri.magister.soap.FieldsValue[] fields, javax.xml.rpc.holders.StringHolder itemPrice, javax.xml.rpc.holders.StringHolder itemPriceDesc) throws java.rmi.RemoteException;

    public void doCheckNewAuctionExt(java.lang.String sessionHandle, pl.net.yuri.magister.soap.FieldsValue[] fields, javax.xml.rpc.holders.StringHolder itemPrice, javax.xml.rpc.holders.StringHolder itemPriceDesc) throws java.rmi.RemoteException;

    public void doAddDescToItems(java.lang.String sessionHandle, long[] itemsIdArray, java.lang.String itDescription, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsAddId, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsDescToLong, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsNotFound) throws java.rmi.RemoteException;

    public long doCheckItemIdByFutureItemId(java.lang.String webapiKey, int countryId, long futureItemId) throws java.rmi.RemoteException;

    public void doGetCatsDataLimit(int countryId, long localVersion, java.lang.String webapiKey, int offset, int packageElement, pl.net.yuri.magister.soap.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;

    public void doGetItemsInfo(java.lang.String sessionHandle, long[] itemsIdArray, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, pl.net.yuri.magister.soap.holders.ArrayOfStructItemInfoListHolder arrayItemListInfo, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsNotFound, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsAdminKilled) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.BillingDataType[] doGetPaymentData(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException;

    public void doGetSellFormFields(int countryCode, long localVersion, java.lang.String webapiKey, pl.net.yuri.magister.soap.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;

    public void doGetSellFormFieldsExt(int countryCode, long localVersion, java.lang.String webapiKey, pl.net.yuri.magister.soap.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;

    public void doGetSitesFlagInfo(int countryCode, java.lang.String webapiKey, pl.net.yuri.magister.soap.holders.ArrayOfSitesFlagInfoHolder sitesInfoList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;

    public void doGetSitesInfo(int countryCode, java.lang.String webapiKey, pl.net.yuri.magister.soap.holders.ArrayOfSitesInfoHolder sitesInfoList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;

    public long doGetSystemTime(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException;

    public int doGetUserID(int countryId, java.lang.String userLogin, java.lang.String userEmail, java.lang.String webapiKey) throws java.rmi.RemoteException;

    public void doGetUserItems(int userId, java.lang.String webapiKey, int countryId, int offset, int limit, pl.net.yuri.magister.soap.holders.ArrayOfUserItemListHolder userItemList, javax.xml.rpc.holders.IntHolder userItemCount) throws java.rmi.RemoteException;

    public java.lang.String doGetUserLogin(int countryId, int userId, java.lang.String webapiKey) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.SysStatusType[] doQueryAllSysStatus(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException;

    public void doGetSellFormFieldsExtLimit(int countryCode, long localVersion, java.lang.String webapiKey, int offset, int packageElement, pl.net.yuri.magister.soap.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException;

    public void doGetSellFormFieldsLimit(int countryCode, long localVersion, java.lang.String webapiKey, int offset, int packageElement, pl.net.yuri.magister.soap.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException;

    public void doQuerySysStatus(int sysvar, int countryId, java.lang.String webapiKey, javax.xml.rpc.holders.StringHolder info, javax.xml.rpc.holders.LongHolder verKey) throws java.rmi.RemoteException;

    public void doShowCat(java.lang.String sessionHandle, int catId, int catItemState, int catItemOption, pl.net.yuri.magister.soap.DurationTimeInfo catItemDurationOption, pl.net.yuri.magister.soap.FieldsValue[] catAttribFields, int catSortOptions, pl.net.yuri.magister.soap.PriceCatInfo catItemsPrice, int catItemsOffset, int catItemsLimit, int catOrderFulfillmentTime, pl.net.yuri.magister.soap.holders.ArrayOfCatInfoStructHolder catParentArray, pl.net.yuri.magister.soap.holders.ArrayOfCatInfoStructHolder catChildArray, pl.net.yuri.magister.soap.holders.ArrayOfCatInfoStructHolder catSisterArray, javax.xml.rpc.holders.IntHolder catItemsCount, javax.xml.rpc.holders.IntHolder catItemsCountFeatured, pl.net.yuri.magister.soap.holders.ArrayOfSearchResponseHolder catItemsArray) throws java.rmi.RemoteException;

    public void doShowItemInfo(java.lang.String sessionHandle, long itemId, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, pl.net.yuri.magister.soap.holders.ItemInfoHolder itemListInfo, pl.net.yuri.magister.soap.holders.ArrayOfItemCatListHolder itemCatPath, pl.net.yuri.magister.soap.holders.ArrayOfItemImageListHolder itemImgList, pl.net.yuri.magister.soap.holders.ArrayOfAttribStructHolder itemAttribList, pl.net.yuri.magister.soap.holders.ArrayOfPostageStructHolder itemPostageOptions, pl.net.yuri.magister.soap.holders.ItemPaymentOptionsHolder itemPaymentOptions, pl.net.yuri.magister.soap.holders.CompanyInfoStructHolder itemCompanyInfo) throws java.rmi.RemoteException;

    public void doShowUser(java.lang.String webapiKey, int countryId, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.StringHolder userLogin, javax.xml.rpc.holders.IntHolder userCountry, javax.xml.rpc.holders.LongHolder userCreateDate, javax.xml.rpc.holders.LongHolder userLoginDate, javax.xml.rpc.holders.IntHolder userRating, javax.xml.rpc.holders.IntHolder userIsNewUser, javax.xml.rpc.holders.IntHolder userNotActivated, javax.xml.rpc.holders.IntHolder userClosed, javax.xml.rpc.holders.IntHolder userBlocked, javax.xml.rpc.holders.IntHolder userTerminated, javax.xml.rpc.holders.IntHolder userHasPage, javax.xml.rpc.holders.IntHolder userIsSseller, javax.xml.rpc.holders.IntHolder userIsEco, pl.net.yuri.magister.soap.holders.ShowUserFeedbacksHolder userPositiveFeedback, pl.net.yuri.magister.soap.holders.ShowUserFeedbacksHolder userNegativeFeedback, pl.net.yuri.magister.soap.holders.ShowUserFeedbacksHolder userNeutralFeedback, javax.xml.rpc.holders.IntHolder userJuniorStatus, javax.xml.rpc.holders.IntHolder userHasShop, javax.xml.rpc.holders.IntHolder userCompanyIcon, javax.xml.rpc.holders.IntHolder userSellRatingCount, pl.net.yuri.magister.soap.holders.ArrayOfSellRatingAverageStructHolder userSellRatingAverage, javax.xml.rpc.holders.IntHolder userIsAllegroStandard) throws java.rmi.RemoteException;

    public void doVerifyItem(java.lang.String sessionHandle, int localId, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.IntHolder itemListed) throws java.rmi.RemoteException;

    public void doAddWatchList(java.lang.String sessionHandle, long[] itemsIdArray, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsAddId, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsNotFound, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsAdminKilled) throws java.rmi.RemoteException;

    public int doFeedback(java.lang.String sessionHandle, int feItemId, int feFromUserId, int feToUserId, java.lang.String feComment, java.lang.String feCommentType, int feOp, pl.net.yuri.magister.soap.SellRatingEstimationStruct[] feRating) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.BidListStruct2[] doGetBidItem2(java.lang.String sessionHandle, long itemId) throws java.rmi.RemoteException;

    public void doGetFeedback(java.lang.String sessionHandle, int feedbackFrom, int feedbackTo, int feedbackOffset, java.lang.String feedbackKindList, pl.net.yuri.magister.soap.holders.ArrayOfFeedbackListHolder feedbackList, javax.xml.rpc.holders.IntHolder feedbackCount) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.SiteJournal[] doGetSiteJournal(java.lang.String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.SiteJournalInfo doGetSiteJournalInfo(java.lang.String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.MyAccountStruct2[] doMyAccount2(java.lang.String sessionHandle, java.lang.String accountType, int offset, int[] itemsArray, int limit) throws java.rmi.RemoteException;

    public int doMyAccountItemsCount(java.lang.String sessionHandle, java.lang.String accountType, int[] itemsArray) throws java.rmi.RemoteException;

    public java.lang.String doMyBilling(java.lang.String sessionHandle) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.MyContactList[] doMyContact(java.lang.String sessionHandle, int[] auctionIdList, int offset, int desc) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.MyFeedbackListStruct2[] doMyFeedback2(java.lang.String sessionHandle, java.lang.String feedbackType, int offset, int desc, int[] itemsArray) throws java.rmi.RemoteException;

    public void doSearch(java.lang.String sessionHandle, pl.net.yuri.magister.soap.SearchOptType searchQuery, javax.xml.rpc.holders.IntHolder searchCount, javax.xml.rpc.holders.IntHolder searchCountFeatured, pl.net.yuri.magister.soap.holders.ArrayOfSearchResponseHolder searchArray, pl.net.yuri.magister.soap.holders.ArrayOfExcludedWordsHolder searchExcludedWords) throws java.rmi.RemoteException;

    public float doGetAdminUserLicenceDate(java.lang.String adminSessionHandle, java.lang.String userLicLogin) throws java.rmi.RemoteException;

    public float doGetUserLicenceDate(java.lang.String sessionHandle) throws java.rmi.RemoteException;

    public void doMyBillingItem(java.lang.String sessionHandle, int itemId, java.lang.String option, pl.net.yuri.magister.soap.holders.ItemBillingListHolder entryFees, pl.net.yuri.magister.soap.holders.ItemBillingListHolder endingFees) throws java.rmi.RemoteException;

    public int doSetUserLicenceDate(java.lang.String adminSessionHandle, java.lang.String userLicLogin, int userLicCountry, float userLicDate) throws java.rmi.RemoteException;

    public java.lang.String doBidItem(java.lang.String sessionHandle, long bidItId, float bidUserPrice, long bidQuantity, long bidBuyNow) throws java.rmi.RemoteException;

    public void doCancelBidItem(java.lang.String sessionHandle, long cancelItemId, int[] cancelBidsArray, java.lang.String cancelBidsReason, long cancelAddToBlackList, javax.xml.rpc.holders.IntHolder cancelBidValue, pl.net.yuri.magister.soap.holders.ArrayOfCancelBidsIDHolder cancelledBids, pl.net.yuri.magister.soap.holders.ArrayOfCancelBidsIDHolder notCancelledBids) throws java.rmi.RemoteException;

    public java.lang.String doChangePriceItem(java.lang.String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, float newStartingPrice, float newReservePrice, float newBuyNowPrice) throws java.rmi.RemoteException;

    public int doFinishItem(java.lang.String sessionHandle, long finishItemId, int finishCancelAllBids, java.lang.String finishCancelReason) throws java.rmi.RemoteException;

    public int doRequestCancelBid(java.lang.String sessionHandle, long requestItemId, java.lang.String requestCancelReason) throws java.rmi.RemoteException;

    public void doGetCatsDataCount(int countryId, long localVersion, java.lang.String webapiKey, javax.xml.rpc.holders.IntHolder catsCount, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.MyFeedbackListStruct2[] doMyFeedback2Limit(java.lang.String sessionHandle, java.lang.String feedbackType, int offset, int desc, int[] itemsArray, int packageElement) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.CountryInfoType[] doGetCountries(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.TemplateInfoType[] doGetServiceTemplates(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException;

    public void doGetSellFormAttribs(int countryId, java.lang.String webapiKey, long localVersion, int catId, pl.net.yuri.magister.soap.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.FeedbackResultStruct[] doFeedbackMany(java.lang.String sessionHandle, pl.net.yuri.magister.soap.FeedbackManyStruct[] feedbacksList) throws java.rmi.RemoteException;

    public void doShowItemInfoExt(java.lang.String sessionHandle, long itemId, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, pl.net.yuri.magister.soap.holders.ItemInfoExtHolder itemListInfoExt, pl.net.yuri.magister.soap.holders.ArrayOfItemCatListHolder itemCatPath, pl.net.yuri.magister.soap.holders.ArrayOfItemImageListHolder itemImgList, pl.net.yuri.magister.soap.holders.ArrayOfAttribStructHolder itemAttribList, pl.net.yuri.magister.soap.holders.ArrayOfPostageStructHolder itemPostageOptions, pl.net.yuri.magister.soap.holders.ItemPaymentOptionsHolder itemPaymentOptions, pl.net.yuri.magister.soap.holders.CompanyInfoStructHolder itemCompanyInfo) throws java.rmi.RemoteException;

    public int doGetWaitingFeedbacksCount(java.lang.String sessionHandle) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.WaitFeedbackStruct[] doGetWaitingFeedbacks(java.lang.String sessionHandle, int offset, int packageSize) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.BlackListStruct[] doGetBlackListUsers(java.lang.String sessionHandle) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.BlackListResStruct[] doRemoveFromBlackList(java.lang.String sessionHandle, long[] usersIdArray) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.ServiceInfoCatStruct[] doGetServiceInfoCategories(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.ServiceInfoStruct[] doGetServiceInfo(int countryCode, int anCatId, long anItDate, int anItId, java.lang.String webapiKey) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.StateInfoStruct[] doGetStatesInfo(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.CatInfoType[] doGetShopCatsData(java.lang.String sessionHandle) throws java.rmi.RemoteException;

    public int doCheckExternalKey(java.lang.String webapiKey, long userId, long itemId, java.lang.String hashKey) throws java.rmi.RemoteException;

    public void doSellSomeAgainInShop(java.lang.String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellShopDuration, int sellShopOptions, int sellProlongOptions, long sellShopCategory, pl.net.yuri.magister.soap.holders.ArrayOfStructSellAgainHolder itemsSellAgain, pl.net.yuri.magister.soap.holders.ArrayOfStructSellFailedHolder itemsSellFailed, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException;

    public int doGetSuperSellerStatus(java.lang.String webapiKey, long userId) throws java.rmi.RemoteException;

    public void doGetMyData(java.lang.String sessionHandle, pl.net.yuri.magister.soap.holders.UserDataStructHolder userData, pl.net.yuri.magister.soap.holders.InvoiceDataStructHolder invoiceData, pl.net.yuri.magister.soap.holders.CompanyExtraDataStructHolder companyExtraData, pl.net.yuri.magister.soap.holders.CompanySecondAddressStructHolder companySecondAddress, pl.net.yuri.magister.soap.holders.PharmacyDataStructHolder pharmacyData, pl.net.yuri.magister.soap.holders.AlcoholDataStructHolder alcoholData) throws java.rmi.RemoteException;

    public int doInternalIStoreChange(java.lang.String webapiKey, long userId, long istoreId, java.lang.String actionType, long actionDate, long validDate) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.FavouritesSellersStruct[] doGetFavouriteSellers(java.lang.String sessionHandle) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.FavouritesCategoriesStruct[] doGetFavouriteCategories(java.lang.String sessionHandle) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.ItemImagesStruct[] doGetItemsImages(java.lang.String sessionHandle, pl.net.yuri.magister.soap.ItemGetImage[] itemsArray, int imageType) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.SpecialAuctionStruct[] doGetSpecialItems(java.lang.String sessionHandle, int specialType, int specialGroup, int offset, int orderFulfillmentTime) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.UserBlackListAddResultStruct[] doAddToBlackList(java.lang.String sessionHandle, pl.net.yuri.magister.soap.UserBlackListStruct[] usersBlackListArray) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.ItemPostBuyDataStruct[] doGetPostBuyData(java.lang.String sessionHandle, int[] itemsArray) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.CancelRefundFormResultStruct[] doCancelRefundForms(java.lang.String sessionHandle, pl.net.yuri.magister.soap.CancelRefundDataStruct[] refundCancelDataArr) throws java.rmi.RemoteException;

    public void doGetSessionHandleForWidget(java.lang.String webapiKey, int countryCode, javax.xml.rpc.holders.StringHolder sessionHandle, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.CancelRefundWarningResultStruct[] doCancelRefundWarnings(java.lang.String sessionHandle, pl.net.yuri.magister.soap.CancelRefundWarningStruct[] cancelRefundWarningsDataArr) throws java.rmi.RemoteException;

    public int doInternalSendMessage(java.lang.String sessionHandle, int userId, int mail_template_id, java.lang.String[] arrayOfAdditionalData) throws java.rmi.RemoteException;

    public void doGetRefundTransactions(java.lang.String sessionHandle, int offset, int limit, javax.xml.rpc.holders.IntHolder refundFormsCount, pl.net.yuri.magister.soap.holders.ArrayOfRefundFormDataStructHolder refundFormsList) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.SendReminderMessageResultStruct[] doSendReminderMessages(java.lang.String sessionHandle, pl.net.yuri.magister.soap.SendReminderMessageStruct[] sendReminderMessagesDataArr) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.ItemRemoveWatchStruct[] doRemoveFromWatchList(java.lang.String sessionHandle, long[] itemsIdArray) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.SendRefundFormResultStruct[] doSendRefundForms(java.lang.String sessionHandle, pl.net.yuri.magister.soap.SendRefundFormStruct[] sendRefundFormsDataArr) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.RefundFormStatusResultStruct[] doGetRefundFormsStatuses(java.lang.String sessionHandle, pl.net.yuri.magister.soap.RefundFormStatusStruct[] refundFormsStatusesDataArr) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.RefundReasonStruct[] doGetRefundReasons(java.lang.String webapiKey, int countryCode) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.UserIncomingPaymentStruct[] doGetMyIncomingPayments(java.lang.String sessionHandle, int buyerId, long itemId, long transRecvDateFrom, long transRecvDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.UserPaymentStruct[] doGetMyPayments(java.lang.String sessionHandle, int sellerId, long itemId, long transCreateDateFrom, long transCreateDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.UserPayoutStruct[] doGetMyPayouts(java.lang.String sessionHandle, long transCreateDateFrom, long transCreateDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException;

    public void doChangeQuantityItem(java.lang.String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, int newItemQuantity, javax.xml.rpc.holders.StringHolder itemInfo, javax.xml.rpc.holders.IntHolder itemQuantityLeft, javax.xml.rpc.holders.IntHolder itemQuantitySold) throws java.rmi.RemoteException;

    public void doShowUserPage(java.lang.String webapiKey, int countryId, long userId, javax.xml.rpc.holders.StringHolder userPageContent, javax.xml.rpc.holders.StringHolder userPagePharmacyPermit, javax.xml.rpc.holders.StringHolder userPageAlcoholPermit) throws java.rmi.RemoteException;

    public java.lang.String doSendEmailToUser(java.lang.String sessionHandle, long mailToUserItemId, javax.xml.rpc.holders.LongHolder mailToUserReceiverId, int mailToUserSubjectId, int mailToUserOption, java.lang.String mailToUserMessage) throws java.rmi.RemoteException;

    public long[] doGetTransactionsIDs(java.lang.String sessionHandle, long[] itemsIdArray, java.lang.String userRole) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.PostBuyFormDataStruct[] doGetPostBuyFormsData(java.lang.String sessionHandle, long[] transactionsIdsArray) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.UserIncomingPaymentRefundsStruct[] doGetMyIncomingPaymentsRefunds(java.lang.String sessionHandle, int buyerId, long itemId, int limit, int offset) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.UserPaymentRefundsStruct[] doGetMyPaymentsRefunds(java.lang.String sessionHandle, int sellerId, long itemId, int limit, int offset) throws java.rmi.RemoteException;

    public void doGetMySellRating(java.lang.String sessionHandle, javax.xml.rpc.holders.IntHolder sellRatingTotalCount, pl.net.yuri.magister.soap.holders.ArrayOfSellRatingAverageStructHolder sellRatingAverage, pl.net.yuri.magister.soap.holders.ArrayOfSellRatingDetailStructHolder sellRatingDetails, pl.net.yuri.magister.soap.holders.ArrayOfSellRatingAveragePerMonthHolder sellRatingStatsPerMonth) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.SellRatingInfoStruct[] doGetSellRatingReasons(java.lang.String webapiKey, int countryCode) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.DealsStruct[] doGetDeals(java.lang.String sessionHandle, long itemId, int buyerId) throws java.rmi.RemoteException;

    public float doMakeDiscount(java.lang.String sessionHandle, long dealId, float discountAmount, float discountPercentage) throws java.rmi.RemoteException;

    public void doChangeItem(java.lang.String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, pl.net.yuri.magister.soap.FieldsValue[] itemFields, pl.net.yuri.magister.soap.ItemImageOptionsStruct[] itemImagesOptions, javax.xml.rpc.holders.FloatHolder itemCountrySurchargeValue, javax.xml.rpc.holders.StringHolder itemCountrySurchargeCurrency, javax.xml.rpc.holders.FloatHolder sellerCountrySurchargeValue, javax.xml.rpc.holders.StringHolder sellerCountrySurchargeCurrency) throws java.rmi.RemoteException;

    public void doFinishItems(java.lang.String sessionHandle, pl.net.yuri.magister.soap.FinishItemsStruct[] finishItemsList, pl.net.yuri.magister.soap.holders.ArrayOfFinishSuccessStructHolder finishItemsSucceed, pl.net.yuri.magister.soap.holders.ArrayOfFinishFailureStructHolder finishItemsFailed) throws java.rmi.RemoteException;

    public void doGetShipmentData(int countryId, java.lang.String webapiKey, pl.net.yuri.magister.soap.holders.ArrayOfShipmentDataStructHolder shipmentDataList, javax.xml.rpc.holders.LongHolder localVersion) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.FieldsValue[] doGetItemFields(java.lang.String sessionHandle, long itemId) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.ProductStruct[] doFindProductByName(java.lang.String sessionHandle, java.lang.String productName, long categoryId) throws java.rmi.RemoteException;

    public void doGetProductItems(java.lang.String sessionHandle, long productId, int categoryId, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder productItemsCount, pl.net.yuri.magister.soap.holders.ArrayOfProductItemsIdsHolder productItemsIds) throws java.rmi.RemoteException;

    public pl.net.yuri.magister.soap.ProductStruct doFindProductByCode(java.lang.String sessionHandle, java.lang.String productCode) throws java.rmi.RemoteException;

    public int doRequestSurcharge(java.lang.String sessionHandle, long transactionId, float surchargeValue, java.lang.String surchargeMessageToBuyer) throws java.rmi.RemoteException;
}
