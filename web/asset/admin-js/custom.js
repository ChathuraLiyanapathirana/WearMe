//------------------------------------------------------Variables for Globel Use
var var_mcm;
var var_scm;
var var_brand;
var var_offer;
var var_garment;
var var_product;

//---------------------------------------------------------------First Call AJAX

getMCData();
getBrandData();
//getOfferData();


function getMCData() {
    var ajaxConfigure = {
        type: "GET",
        url: "../maincategory/getMCData",
        async: true,
        data: ""
    };
    $.ajax(ajaxConfigure)
            .done(function (response) {
                if (response != "emptyList") {
                    console.log("get data ok");
                    var_mcm = JSON.parse(response);
                }
            });
}

function getSCData() {
    var ajaxConfigure = {
        type: "GET",
        url: "../subcategory/view",
        async: true,
        data: ""
    };
    $.ajax(ajaxConfigure)
            .done(function (response) {
                console.log(response);
                if (response != "emptyList") {
                    var_scm = JSON.parse(response);
                }
            });
}

function getBrandData() {
    var ajaxConfigure = {
        type: "GET",
        url: "../brand/view",
        async: true,
        data: ""
    };
    $.ajax(ajaxConfigure)
            .done(function (response) {
                if (response != "emptyList") {
                    var_brand = JSON.parse(response);
                }
            });
}

function getOfferData() {
    var ajaxConfigure = {
        type: "GET",
        url: "../offer/view",
        async: true,
        data: ""
    };
    $.ajax(ajaxConfigure)
            .done(function (response) {
                if (response != "emptyList") {
                    var_offer = JSON.parse(response);
                }
            });
}



//----------------------------------------------------------------AJAX Functions



//------------------------------------------------------------Main Category View
function fillMCData() {
    $("#mcm-table tbody").empty();
    $("#mcm-name-combo").empty();
    $("#scm-mcm-name").empty();
    var html;
    var option;
    for (var i = 0; i < var_mcm.length; i++) {
        option += "<option>" + var_mcm[i].mcm_name + "</option>";
        html += "<tr class='info'><td>" + var_mcm[i].mcm_name + "</td></tr>";
    }
    $("#mcm-table tbody").append(html);
    $("#mcm-table").DataTable();
    $("#mcm-name-combo").append(option);
    $("#scm-mcm-name").append(option);
}
//-----------------------------------------------Main Category Update And Delete
$('#mcm-table').on('contextmenu', 'tr', function (e) {
    e.preventDefault();
    $('#mcm-update-form #mcm_name').val($(this).text());
    $('#mcm-manage-modal').modal('toggle');
});

$('#mcm-update-btn').click(function () {
    var ajaxConfigure = {
        type: "POST",
        url: "../maincategory/update",
        async: true,
        data: $("#mcm-update-form").serialize()
    };
    $.ajax(ajaxConfigure)
            .done(function (response) {
                console.log("submit ok");
                if (response.toString() == "success") {
                    $('#mcm-manage-modal').modal('hide');
                    swal("Success!", "Main Category Updated!", "success");

                }
                if (response.toString() == "error") {
                    swal("error!", "Something Went Wrong!", "error");
                }
                fillMCData();
            });
});

$('#mcm-delate-btn').click(function () {
    console.log("iooooo");
    var ajaxConfigure = {
        type: "POST",
        url: "../maincategory/delete",
        async: true,
        data: $("#mcm-update-form").serialize()
    };
    $.ajax(ajaxConfigure)
            .done(function (response) {
                console.log("submit ok");
                if (response.toString() == "success") {
                    $('#mcm-manage-modal').modal('hide');
                    swal("Success!", "Main Category Deleted!", "success");
                    fillMCData();
                }
                if (response.toString() == "error") {
                    swal("error!", "Something Went Wrong!", "error");
                }
            });
});

//-------------------------------------------------------Send Main Category Data
$("#mcm-submit-btn").click(function () {
    var ajaxConfigure = {
        type: "POST",
        url: "../maincategory/add",
        async: true,
        data: $("#mcm-view-form").serialize()
    };
    $.ajax(ajaxConfigure)
            .done(function (response) {
                console.log("submit ok");
                if (response.toString() == "success") {
                    swal("Success!", "New Main Category Added!", "success");
                    fillMCData();
                }
                if (response.toString() == "error") {
                    swal("error!", "Something Went Wrong!", "error");
                }
            });
});

//-------------------------------------------------------------Sub Category View
function getSCData() {
    var ajaxConfigure = {
        type: "GET",
        url: "../subcategory/view",
        async: true,
        data: ""
    };
    $.ajax(ajaxConfigure)
            .done(function (response) {
                console.log(response);
                if (response != "emptyList") {
                    var_scm = JSON.parse(response);
                    fillMCData();
                    $("#scm-table tbody").empty();
                    var html;
                    for (var i = 0; i < var_scm.length; i++) {
                        html += "<tr class='info'><td>" + var_scm[i].scm_name + "</td> <td>" + var_scm[i].mcm_name + "</td></tr>";
                    }
                    $("#scm-table tbody").append(html);
                }
            });
}

//-------------------------------------------------------Send Sub Category Data
$("#scm-submit-btn").click(function () {
    var ajaxConfigure = {
        type: "POST",
        url: "../subcategory/add",
        async: true,
        data: $("#scm-view-form").serialize()
    };
    $.ajax(ajaxConfigure)
            .done(function (response) {
                console.log(response);
                if (response.toString() == "success") {
                    getSCData();
                    swal("Success!", "New Sub Category Added!", "success");
                }
                if (response.toString() == "error") {
                    swal("error!", "Something Went Wrong!", "error");
                }
            });
});

//--------------------------------------------------------------------Brand View
function fillBrandData() {
    $("#mcm-table tbody").empty();
    $("#mcm-name-combo").empty();
    var html;
    var option;
    for (var i = 0; i < var_mcm.length; i++) {
        option += "<option>" + var_mcm[i].mcm_name + "</option>";
        html += "<tr class='info'><td>" + var_mcm[i].mcm_name + "</td></tr>";
    }
    $("#mcm-table tbody").append(html);
    $("#mcm-name-combo").append(option);
    $("#brand-table").DataTable();
}
//---------------------------------------------------------------Send Brand Data
$("#brand-submit-btn").click(function () {
    var ajaxConfigure = {
        type: "POST",
        url: "../brand/add",
        async: true,
        data: $("#brand-view-form").serialize()
    };
    $.ajax(ajaxConfigure)
            .done(function (response) {
                console.log("submit ok");
                if (response.toString() == "success") {
                    swal("Success!", "New Brand Added!", "success");
                    fillBrandData();
                }
                if (response.toString() == "error") {
                    swal("error!", "Something Went Wrong!", "error");
                }
            });
});
//-------------------------------------------------------Brand Update And Delete
$('#brand-table').on('contextmenu', 'tr', function (e) {
    e.preventDefault();
    $('#brand-update-form #brand_name').val($(this).text());
    $('#brand-manage-modal').modal('toggle');
});

$('#brand-update-btn').click(function () {
    var ajaxConfigure = {
        type: "POST",
        url: "../brand/update",
        async: true,
        data: $("#brand-update-form").serialize()
    };
    $.ajax(ajaxConfigure)
            .done(function (response) {
                console.log("submit ok");
                if (response.toString() == "success") {
                    $('#brand-manage-modal').modal('hide');
                    swal("Success!", "Brand Updated!", "success");
                }
                if (response.toString() == "error") {
                    swal("error!", "Something Went Wrong!", "error");
                }
                fillMCData();
            });
});

$('#brand-delate-btn').click(function () {
    var ajaxConfigure = {
        type: "POST",
        url: "../brand/delete",
        async: true,
        data: $("#brand-update-form").serialize()
    };
    $.ajax(ajaxConfigure)
            .done(function (response) {
                console.log("submit ok");
                if (response.toString() == "success") {
                    $('#brand-manage-modal').modal('hide');
                    swal("Success!", "Brand Deleted!", "success");
                    fillMCData();
                }
                if (response.toString() == "error") {
                    swal("error!", "Something Went Wrong!", "error");
                }
            });
});



//-------------------------------------------------------Panel Visibility Manage

$("#mcm-view-btn").click(function () {
    $("#scm-div").hide("fast");
    $("#offer-div").hide("fast");
    $("#garment-div").hide("fast");
    $("#brand-div").hide("fast");
    $("#mcm-div").toggle("fast", fillMCData());
});
$("#scm-view-btn").click(function () {
    $("#mcm-div").hide("fast");
    $("#offer-div").hide("fast");
    $("#garment-div").hide("fast");
    $("#brand-div").hide("fast");
    $("#scm-div").toggle("fast", getSCData());
});
$("#offer-view-btn").click(function () {
    $("#mcm-div").hide("fast");
    $("#scm-div").hide("fast");
    $("#brand-div").hide("fast");
    $("#garment-div").hide("fast");
    $("#offer-div").toggle("fast");
});
$("#brand-view-btn").click(function () {
    $("#mcm-div").hide("fast");
    $("#scm-div").hide("fast");
    $("#offer-div").hide("fast");
    $("#garment-div").hide("fast");
    $("#brand-div").toggle("fast", fillBrandData());
});
$("#gm-view-btn").click(function () {
    $("#mcm-div").hide("fast");
    $("#scm-div").hide("fast");
    $("#offer-div").hide("fast");
    $("#brand-div").hide("fast");
    $("#garment-div").toggle("fast");
});