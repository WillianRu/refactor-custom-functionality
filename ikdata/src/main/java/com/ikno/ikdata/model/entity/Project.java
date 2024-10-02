package com.ikno.ikdata.model.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String listeningDirectory;

    @Column(unique = true, nullable = false)
    private String projectName;

    @Column(nullable = true)
    private String pathExportData;

    @Enumerated(EnumType.STRING)
    private OcrEngine ocrEngine;

    private String azureKey;
    private String azureEndPoint;

    private String language;

    @Column(nullable = false)
    private int segmentation;

    private String charactersWhitelist;

    @Column(nullable = false)
    private int priority;

    @Column(nullable = true)
    private String dataExportExtension;

    @Column(nullable = true)
    private String singleImageExportExtension;

    private boolean cleanup;
    private boolean cleanImageFormatLines;

    private String classificationType;

    private boolean emailListening;
    private String emailUser;
    private String emailPassword;
    private String emailServer;
    private LocalDateTime emailDateFilter;

    private boolean infuseListening;
    private String infuseApiKey;
    private String infuseOrgId;
    private String infuseChildOrgId;
    private String infuseStartMessage;
    private String infuseSuccessMessage;

    private Boolean exportDatabaseListeningToIkdata;
    private Boolean exportDatabaseListening;
    private String exportDatabaseUsername;
    private String exportDatabasePassword;
    private String exportDatabaseManagerType;
    private String exportDatabaseName;
    private String exportHost;
    private String exportNumberPort;

    // @ColumnDefault("false")
    private boolean skipValidation;
    private Boolean forceSkipValidation;

    private String processingDirectory;

    @Transient
    private int numberBatches;

    private String columnsToExportCSV;

    private String currUser;

    private int version;

    @Transient
    private boolean unchangeVersion;

    private boolean exportToMultipageDocs;

    private boolean binarizeScannedText;

    private boolean intelligentBold;

    private Boolean noNumerateExport;

    private Boolean multiBatchImport;

    private String docxRegExpToClean;

    private Integer docxMaxSpaceInLines;

    private Boolean exportReSampledImages;

    private Boolean rotateTurnedImages;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "relatedModel", joinColumns = @JoinColumn(name = "project_id"))
    @Column(name = "relatedModels")
    private List<Long> relatedModels;

    private Boolean objectDetection;

    private Boolean cutObjects;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "relatedObjects", joinColumns = @JoinColumn(name = "project_id"))
    @Column(name = "relatedObjects")
    private Set<String> relatedObjects;

    @Column(name = "\"validate_confidence_view\"")
    @Enumerated(EnumType.STRING)
    private ConfidenceViewType validateConfidenceView;

    private AzureModelType azureModelType;

    public enum AzureModelType {
        read, document
    }

    public enum ConfidenceViewType {
        OFF, BASIC, ADVANCED
    }

    public enum OcrEngine {
        TESSERACT, AZUREAI
    }

    // @ColumnDefault("0")
    @Column(nullable = true)
    private Boolean measuring = false;

    public Project() {
        this.ocrEngine = OcrEngine.TESSERACT;
        this.docxMaxSpaceInLines = 50;
        this.noNumerateExport = false;
        this.multiBatchImport = false;
        this.exportReSampledImages = false;
        this.rotateTurnedImages = false;
        this.validateConfidenceView = ConfidenceViewType.OFF;
        this.objectDetection = false;
    }

    public Project(String listeningDirectory) {
        this.ocrEngine = OcrEngine.TESSERACT;
        this.listeningDirectory = listeningDirectory;
        this.docxMaxSpaceInLines = 50;
        this.noNumerateExport = false;
        this.multiBatchImport = false;
        this.exportReSampledImages = false;
        this.rotateTurnedImages = false;
        this.validateConfidenceView = ConfidenceViewType.OFF;
        this.objectDetection = false;
    }
}
