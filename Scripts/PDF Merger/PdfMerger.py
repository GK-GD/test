import PyPDF2
import sys

# Ensure that two PDF filenames are provided as command-line arguments
if len(sys.argv) != 3:
    print("Usage: python PdfMerger.py <PDF file 1> <PDF file 2>")
    sys.exit(1)

# Initialize PdfMerger
merger = PyPDF2.PdfMerger()

# Append each PDF file specified by the user
for pdf_file in sys.argv[1:]:
    merger.append(pdf_file)

# Write out the merged PDF to a new file
output_filename = "CombinedFile.pdf"
merger.write(output_filename)
merger.close()

print(f"Merged PDF saved as {output_filename}")
