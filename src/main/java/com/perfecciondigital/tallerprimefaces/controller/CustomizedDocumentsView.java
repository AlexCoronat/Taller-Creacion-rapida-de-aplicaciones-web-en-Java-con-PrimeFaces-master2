package com.perfecciondigital.tallerprimefaces.controller;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.primefaces.component.export.ExcelOptions;
import org.primefaces.component.export.PDFOptions;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;

@Named
@RequestScoped

public class CustomizedDocumentsView implements Serializable {
     
    private ExcelOptions excelOpt;
     
    private PDFOptions pdfOpt;
         
    @PostConstruct
    public void init() {
        customizationOptions();
    }
     /*
      * Éste método ayuda a dar colores a las celdas y las fuentes
      * */
    public void customizationOptions() {
        excelOpt = new ExcelOptions();
        excelOpt.setFacetBgColor("#D7F0FE");
        excelOpt.setFacetFontSize("10");
        excelOpt.setFacetFontColor("#0037A6");
        excelOpt.setFacetFontStyle("BOLD");
        excelOpt.setCellFontColor("#000000");
        excelOpt.setCellFontSize("8");
        excelOpt.setFontName("Verdana");
         
        pdfOpt = new PDFOptions();
        pdfOpt.setFacetBgColor("#D7F0FE");
        pdfOpt.setFacetFontColor("#0037A6");
        pdfOpt.setFacetFontStyle("BOLD");
        pdfOpt.setCellFontSize("12");
        pdfOpt.setFontName("Courier");
    }
    public ExcelOptions getExcelOpt() {
        return excelOpt;
    }
 
    public void setExcelOpt(ExcelOptions excelOpt) {
        this.excelOpt = excelOpt;
    }
 
    public PDFOptions getPdfOpt() {
        return pdfOpt;
    }
 
    public void setPdfOpt(PDFOptions pdfOpt) {
        this.pdfOpt = pdfOpt;
    }
     
    public void postProcessXLS(Object document) {
        HSSFWorkbook wb = (HSSFWorkbook) document;
        HSSFSheet sheet = wb.getSheetAt(0);
        HSSFRow header = sheet.getRow(0);
         
        HSSFCellStyle cellStyle = wb.createCellStyle();  
        cellStyle.setFillForegroundColor(HSSFColor.HSSFColorPredefined.DARK_BLUE.getIndex());
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
         
        for(int i=0; i < header.getPhysicalNumberOfCells();i++) {
            HSSFCell cell = header.getCell(i);
             
            cell.setCellStyle(cellStyle);
        }
    }
     
    public void preProcessPDF(Object document) throws IOException, BadElementException, DocumentException {
        Document pdf = (Document) document;
        pdf.open();
        pdf.setPageSize(PageSize.A4);
 
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
//        String logo = externalContext.getRealPath("") + File.separator 
//        											  + "resources" 
//        											  + File.separator 
//        											  + "demo" 
//        											  + File.separator 
//        											  + "images" 
//        											  + File.separator 
//        											  + "prime_logo.png";
//         
//        pdf.add(Image.getInstance(logo));
    }
}