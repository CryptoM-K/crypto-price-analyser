create-key:
	age-keygen -o key.txt

show-text:
	cat text.txt

encrypt-text:
	age -e -i key.txt -o text.txt.enc text.txt 

decrypt-txt:
	age -d -i key.txt -o text.txt.dec text.txt.enc

encrypt-for-recipient:
	age -e -R recipients.txt -o text.txt.enc text.txt 